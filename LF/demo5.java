package LF;

import java.util.Random;

public class demo5 {

    static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;
            boolean t = con(num, arr);

            if (!t) {
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static boolean con(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                return true;
            }

        }
        return false;
    }
}
