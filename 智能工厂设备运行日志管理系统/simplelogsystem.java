package 智能工厂设备运行日志管理系统;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class simplelogsystem {
    static ArrayList<String> logList = new ArrayList<>();

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入设备ID：");
       String deviceID=sc.next();

       System.out.println("------简单设备日志系统------");
       System.out.println("设备ID：" + deviceID);
       while(true) {
           System.out.println("\n输入温度");
           int temperature = sc.nextInt();
           if (temperature == -1) {
               break;
           }
           String log ="设备id："+deviceID+ "温度：" + temperature + "℃";
           logList.add(log);
           savetofile(deviceID,log);
           System.out.println("已记录：" + log);
           System.out.println("已记录日志数：" + logList.size() + "条日志");
       }
           System.out.println("\n-----所有日志-----");
           for(int i = 0;i<logList.size();i++){
               System.out.println((i+1)+". "+logList.get(i));
           }
           sc.close();
       }
       public static void savetofile(String deviceID,String log){
       String filename = "factory-log-"+deviceID + ".txt";
       try(FileWriter fw = new FileWriter(filename,true)) {
           fw.write(log + "\n");
           System.out.println("日志已保存到文件：" + filename);
       }
       catch(IOException e){
           System.out.println("保存日志时发生错误：" + e.getMessage());

       }
       }
    }





