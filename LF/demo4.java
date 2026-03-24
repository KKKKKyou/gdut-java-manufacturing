package LF;

public class demo4 {
    static void main(String[] args) {
        int arr[] = {1, 3, 6, 7};
        int target = 5;
        int t = 0;
        boolean flag = false;
        while (t < arr.length) {
            if (arr[t] == target) {
                System.out.println(t);
                flag = true;
            }
            t++;
        }
        if (!flag) {
            int s = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > target) {
                    s = i;
                    break;
                }
            }
            System.out.println(s);
        }
    }
}