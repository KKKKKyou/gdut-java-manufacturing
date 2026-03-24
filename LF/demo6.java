package LF;

public class demo6 {
    static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print(arr);

    }
    public static void print( int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print("]");
        System.out.println();

    }
}
