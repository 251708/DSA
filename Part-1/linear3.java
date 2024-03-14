public class linear3 {
    public static void main(String[] args) {
       int[] nums = {13,14,15,16,17,18};
       int target = 20;
       int ans = linearSearch3(nums, target) ;
       System.out.println(ans);
    }
    static int linearSearch3(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }
        /*for(int index = 0; index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
            */

            //this is the enhanced for loop
            for(int element : arr){
    if(element == target){
        return element;
    
}
        }
        return -1;
    
    } 
}

//search the target and return the element 


/*for(int element : arr){
    if(element == target){
        return element;
    }
}
*/
