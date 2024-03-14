public class linear2 {
    public static void main(String[] args) {
      int[]nums = {12,13,14,15,16,17,18,19};
      int target = 16;
      int ans = linearSearch2(nums, target);
      System.out.println(ans);  
    }
    static int linearSearch2(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    
}
