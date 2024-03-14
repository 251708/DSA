import java.util.Scanner;
public class multidimension {
    public static void main(String[] args) {
        //give no.of rows its compulsory bt in case of column u its totally depends on ur choice
       //int[][] arr = new int[3][];
       Scanner in = new Scanner(System.in);
       int[][] arr = {
        {1,3,4},
        {6,7},
        {2,5,8,9}
        
        
       };
       for(int row = 0; row <arr.length; row++){

    for(int col = 0; col<arr[row].length; col++){
        arr[row][col] = in.nextInt();
}
        
       }
    }
    
}
