package t;

import java.util.Scanner;

public class t1again {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int maxTime = -1;
       int maxDay = 0;
       boolean allUnhappy = true;
       for(int i = 1; i <= 7; i++){
           System.out.println("输入设备运行时间");
           int runTime = sc.nextInt();
           System.out.println("输入报警次数");
           int alarmCount = sc.nextInt();
           int total = runTime + alarmCount;
           if(total >= 8){
               allUnhappy = false;
           }
           if(total > maxTime){
               maxTime = total;
               maxDay = i;
           }
       }
       if(allUnhappy){
           System.out.println("0");
       }
       else{
           System.out.println(maxDay);
       }

    }
}
