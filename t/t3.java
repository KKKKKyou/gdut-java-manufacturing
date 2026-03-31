package t;

public class t3 {
    public int single(int nums[]){
        int result=0;
        for(int num:nums){
            result=result^num;

        }
        return result;
    }
}
