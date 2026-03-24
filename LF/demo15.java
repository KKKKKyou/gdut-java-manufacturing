package LF;

public class demo15 {
     public void main(String[] args) {
        int a[] = {1,0 ,2, 3, 4, 5,2,7,7,9,0};
        int val=2;
        int slow=0;
        int fast=0;
        while (fast<a.length){
            if(a[fast]!=val){
                 a[slow]=a[fast];
                slow++;
            }
            fast++;

        }
        for (int i = 0; i < slow; i++){
            System.out.print(a[i] +" " );
        }
    }
}
