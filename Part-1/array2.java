import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
        arr[i] = in.nextInt();
        System.out.print(arr[i] + " " );
        }
    }
    
}
