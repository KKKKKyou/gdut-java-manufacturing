package LF;

import java.util.Random;
import java.util.Scanner;

public class demo7 {
   public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(1, 101);
        System.out.println();
        System.out.println(num);
        int b = 0;
        Scanner sc = new Scanner(System.in); // 将Scanner声明移到循环外
        while (true){
            System.out.println("输入数字");
            int guess = sc.nextInt();
            b++; // 增加猜测次数
            
            if(guess == num){
                System.out.println("恭喜你，猜对了！总共猜了" + b + "次");
                break; // 猜对后退出循环
            }
            else if(num > guess){
                System.out.println("猜小了");
            }
            else if(num < guess){
                System.out.println("猜大了");
            }
            
            if(b >= 10){
                System.out.println("已经猜了10次，游戏结束。正确答案是：" + num);
                break; // 达到10次后结束游戏
            }
        }
        sc.close(); // 关闭Scanner
    }
}
