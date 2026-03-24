package LF;

import java.util.Scanner;

public class ifdemo {
    static void main(String[] args) {
        int hp=200;
        //键盘输入一个值表示人物收到的伤害
        System.out.println("请输入伤害值");
        Scanner sc = new Scanner(System.in);
        int hurt =sc.nextInt();
        hp=hp-hurt;
        if(hp<0){
            hp=1;
        }
        System.out.println("剩余血量："+hp);
        //键盘录入一个值表示技能恢复的血量
        System.out.println("请输入技能恢复的血量");
        Scanner sc1 = new Scanner(System.in);
        int hp1 =sc1.nextInt();
        hp=hp+hp1;
        if(hp>200){
            hp=200;
        }
        System.out.println("剩余血量："+hp);
    }
}
