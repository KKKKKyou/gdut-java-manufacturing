package t;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int maxtime=-1;
int maxday=0;
boolean allunhappy=true;
for (int i = 1; i <= 7; i++){
    System.out.println("输入学习时间");
    int study=sc.nextInt();
    System.out.println("输入娱乐时间");
    int play=sc.nextInt();
    int total=study+play;
    if(total<=8){
        allunhappy=false;
    }
    if(total>maxtime){
        maxtime=total;
        maxday=i;
    }
}
if(allunhappy){
    System.out.println("0");
}
else{
    System.out.println(maxday);
}
sc.close();
    }
}