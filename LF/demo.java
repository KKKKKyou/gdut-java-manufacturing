package LF;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; ) {
            System.out.println("请输入数字：");
            int n = sc.nextInt();
            if (n > 0 && n < 100) {
                a[i] = n;
                i++;
            } else {
                System.out.println("请输入 1-100 的数字");
            }

        }
        System.out.println("最大值是：" + max(a));
        System.out.println("最小值是：" + min(a));
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("和是：" + sum);
        int t = sum - max(a) - min(a);
        System.out.println("平均值是：" + t / a.length);
    }

    public static int max(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }

        }
        return max;
    }

    public static int min(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min){
                min = a[i];
            }

        }
        return min;
    }
}

