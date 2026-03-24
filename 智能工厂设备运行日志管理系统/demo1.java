package 智能工厂设备运行日志管理系统;
import java.io.*;
import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 智能工厂设备运行日志管理系统
 * 功能：温度监控、阈值报警、心跳检测
 */
public class demo1 {
    // 使用 ArrayList 存储日志记录
    static ArrayList<String> logList = new ArrayList<>();
    static final int MAX_LOG_SIZE = 1000;
    // 温度阈值
    static final int TEMPERATURE_THRESHOLD = 80;
    static final int MIN_TEMP = -20;
    static final int MAX_TEMP = 150;
    // 心跳超时时间（秒）
    static final int HEARTBEAT_TIMEOUT = 5;
    // 上次数据接收时间
    static long lastDataTime = System.currentTimeMillis();
    static boolean isOffline = false;
    static String deviceId = "DEVICE-001";

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);

            System.out.println("=== 智能工厂设备运行日志管理系统 ===");
            System.out.println("温度阈值：" + TEMPERATURE_THRESHOLD + "°C");
            System.out.println("心跳超时：" + HEARTBEAT_TIMEOUT + "秒");
            System.out.println("==============================");

            // 循环读取设备数据
            while (true) {
                try {
                    System.out.println("\n请输入设备温度数据（输入 -1 退出）：");

                    // 检查心跳状态
                    checkHeartbeat();

                    if (!sc.hasNextInt()) {
                        String input = sc.next();
                        if (input.equals("-1")) {
                            break;
                        }
                        System.out.println("请输入有效的数字！");
                        continue;
                    }

                    int temperature = sc.nextInt();

                    // 退出条件
                    if (temperature == -1) {
                        break;
                    }

                    // 更新最后数据接收时间
                    lastDataTime = System.currentTimeMillis();

                    // 记录原始数据
                    recordData(temperature);

                    // 检查温度阈值
                    checkTemperatureThreshold(temperature);

                    // 显示当前日志数量
                    System.out.println("已记录日志数：" + logList.size());

                } catch (Exception e) {
                    System.out.println("❌ 发生错误：" + e.getMessage());
                    System.out.println("请重新输入...");
                    Thread.sleep(1000); // 等待 1 秒，避免异常刷屏
                }
            }

            // 输出所有日志
            printAllLogs();

        } catch (Exception e) {
            System.out.println("系统异常：" + e.getMessage());
            e.printStackTrace();
        } finally {
            // 确保 Scanner 关闭
            if (sc != null) {
                sc.close();
            }
        }
    }

    /**
     * 记录设备数据到日志
     *
     * @param temperature 温度值
     */
    /**
     * 记录设备数据到日志（内存 + 文件）
     */
    public static void recordData(int temperature) {
        String currentTime = getCurrentTime();
        String logEntry = "[" + currentTime + "] 设备温度：" + temperature + "°C";

        // 写入内存
        logList.add(logEntry);
        System.out.println("✓ 数据已记录：" + temperature + "°C");

        // 写入文件（工业真实性：日志持久化）
        try (FileWriter fw = new FileWriter("factory_log.txt", true)) {
            fw.write(logEntry + "\n");
        } catch (IOException e) {
            System.out.println("警告：日志写入文件失败");
        }
    }

    /**
     * 检查温度是否超过阈值并记录报警
     *
     * @param temperature 当前温度
     */
    public static void checkTemperatureThreshold(int temperature) {
        if (temperature > TEMPERATURE_THRESHOLD) {
            String alarmTime = getCurrentTime();
            String alarmLog = "[***ALARM***] " + alarmTime + " 温度超标！当前：" +
                    temperature + "°C > 阈值：" + TEMPERATURE_THRESHOLD + "°C";

            logList.add(alarmLog);
            System.out.println("⚠️  警告：温度超标！" + temperature + "°C");

            // 写入文件
            try (FileWriter fw = new FileWriter("factory_log.txt", true)) {
                fw.write(alarmLog + "\n");
            } catch (IOException e) {
                System.out.println("警告：报警日志写入文件失败");
            }
        }
    }

    /**
     * 检查心跳状态，判断设备是否离线
     */
    public static void checkHeartbeat() {
        long currentTime = System.currentTimeMillis();
        long timeDiff = (currentTime - lastDataTime) / 1000; // 转换为秒

        if (timeDiff > HEARTBEAT_TIMEOUT && lastDataTime != 0) {
            String offlineTime = getCurrentTime();
            String offlineLog = "[OFFLINE] " + offlineTime + " 设备离线！已 " + timeDiff + " 秒无数据";

            // 避免重复记录离线日志
            if (!logList.contains(offlineLog)) {
                logList.add(offlineLog);
                System.out.println("📴 设备离线：" + timeDiff + "秒无数据");
            }
        }
    }

    /**
     * 获取当前时间的字符串格式
     *
     * @return 格式化后的时间字符串
     */
    public static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    /**
     * 获取用于文件名的日期格式
     *
     * @return 文件名日期字符串
     */
    public static String getFilenameDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        return now.format(formatter);
    }

    /**
     * 打印所有日志记录
     */
    public static void printAllLogs() {
        System.out.println("\n\n========== 完整日志列表 ==========");
        System.out.println("设备 ID: " + deviceId);
        System.out.println("总记录数：" + logList.size());
        System.out.println("-------------------------------");

        for (int i = 0; i < logList.size(); i++) {
            System.out.println((i + 1) + ". " + logList.get(i));
        }

        System.out.println("-------------------------------");
        System.out.println("日志记录完成");
    }
}
    /**
     * 导出日志到文件（持久化存储）
     * @param filename 文件名
     */



