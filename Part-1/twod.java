public class twod {
    public static void main(String[] args) {
        
    }
    static int[] search(int[][] arr, int target){
      for(int row = 0; row<arr.length; row++){
        for(int col = 0; col<arr[row].length; col++){
            if(arr[row][col] == target){
                return;
            }
        }
      }
    }
}
