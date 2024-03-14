import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {
        int [] nums = {3,4,5,78};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[]arr){
        arr[0] = 92;
    }
    
}
/*
 in this we can see that array is mutable 
 by the help of passing function we change the value of [0] 
 
 */