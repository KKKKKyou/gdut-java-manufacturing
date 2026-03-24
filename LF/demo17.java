package LF;

import java.util.Random;

public class demo17 {
    public static void main(String[] args) {
        int a[] = new int[5];
        for (int i = 0; i <1000; i++) {

            Random r = new Random();
            int vote = r.nextInt(5);
            a[vote]++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + "号投票：" + a[i]);
        }
        int max=a[0];
for (int i = 0; i < a.length; i++){

    if (a[i]>max)
    max=a[i];
}
for (int i = 0; i <a.length; i++){
    if (a[i]==max){
        System.out.println(i+"号是投票最多的人");
    }
}
    }
}
