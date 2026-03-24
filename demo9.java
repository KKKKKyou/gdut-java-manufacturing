package LF;

import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                flag=true;
                break;
            }
        }
        if (flag==true){
            System.out.println("找到了");
        }
        else{
            System.out.println("没有找到");
        }
    }
}
