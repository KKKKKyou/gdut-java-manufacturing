package LF;

public class demo11 {
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 2, 2, 3, 3, 4};
        int slow = 0;
        int fast = 1;
        while (fast<a.length){
            if (a[slow] == a[fast]) {
                fast++;
            }
            else {
                slow++;
                a[slow]=a[fast];
                fast++;
            }
        }
        for (int i = 0; i <=slow; i++) {
            System.out.println(a[i]);
        }    }
}