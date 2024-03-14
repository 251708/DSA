import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n ; row++){
            for(int col = 1;col<= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
/*
 this is a method in which we take the input from the user
 */
