package LF;

public class demo13 {
   public static void main(String[] args) {
   int a[]={1,2,3,4,5,6,7,8,9,10};
   print(a);
    }
    public static void print(int a[]){
        System.out.print("[");
        for (int i = 0; i < a.length; i++){
            if(i==a.length-1){
                System.out.print(a[i]);
            }
            else{
                System.out.print(a[i]+", ");
            }
        }
        System.out.print("]");
    }


}
