package LF;

import java.util.Random;

public class demo10 {
   public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
       Random r=new Random();
       for (int i=0;i<a.length;i++){
           int c=r.nextInt(a.length);
           int temp=a[i];
           a[i]=a[c];
           a[c]=temp;
       }
       for (int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
    }
}
