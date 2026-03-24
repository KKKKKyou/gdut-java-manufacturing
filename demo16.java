package LF;

import java.sql.SQLOutput;
import java.util.Random;

public class demo16 {
   public static void main(String[] args) {
        int money=20000;
        int n=5;
       Random r=new Random();
       for (int i=1;i<=n-1;i++){
           int mymoney=r.nextInt(money-(n-i))+1;
           money-=mymoney;
           System.out.println("第"+i+"个人抽了"+mymoney);
       }
       System.out.println("剩余"+money);
    }
}
