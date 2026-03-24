package LF;

public class demo3 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};
        int arr3[] = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr.length + i] = arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            for (int j=i+1;j<arr3.length;j++){
                if(arr3[i]>arr3[j]){
                    int temp=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }

    }
}
