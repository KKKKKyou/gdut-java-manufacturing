package LF;

public class demo18 {

    public static void main(String[] args) {
 int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
 int leftmax[]=new int [a.length];
 int temp=a[0];
 for(int i=0;i<a.length;i++){
     if(temp>a[i]){
         leftmax[i]=temp;
     }
     else{
         leftmax[i]=a[i];
         temp=a[i];

     }
 }
 int rightmax[]=new int[a.length];
 temp=a[a.length-1];
        for (int i =a.length-1; i >=0 ; i--) {
            if(temp>a[i]){
                rightmax[i]=temp;
            }
            else{
                rightmax[i]=a[i];
                temp=a[i];
            }
        }
        int res[]=new int [a.length];
        for (int i = 0; i <a.length ; i++) {
            if (rightmax[i] > leftmax[i]) {
                res[i] = leftmax[i];
            } else {
                res[i] = rightmax[i];
            }
        }
        int sum=0;
            for (int j = 0; j <a.length ; j++) {
                sum=sum+res[j]-a[j];
            }
        System.out.println(sum);
    }
}
