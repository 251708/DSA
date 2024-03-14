import java.util.*;
public class largestoptimal {
    public static void main (String args[]){
        int arr1[] = {2,5,1,3,0};
        System.out.println("The largest element in the array is :" +findlargestElement(arr1));
        int arr2[] = {8,10,5,7,9};
        System.out.println("The largest element in the array is :" + findlargestElement(arr2));
        
    }
    static int findlargestElement(int arr[]){
     int max = arr[0];
     for(int i = 0; i<arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
     }
     return max;
    }
    
}
