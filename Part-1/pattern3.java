import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        for(int row =1; row<=n;row++){
            for(int col =1; col<=n-row+1; col++){
System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
