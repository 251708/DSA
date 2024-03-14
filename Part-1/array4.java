import java.util.Arrays;
import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       String [] str = new String[9];
       for (int i = 0; i<str.length;i++){
        str[i] = in.next();
       }

       //if we just want to modify a particular index of the array then we do like this
      str[5] = "sakshi";
      System.out.println(Arrays.toString(str));  
        
    }
    
}
