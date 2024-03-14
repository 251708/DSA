import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }
    }

    
}


//find the solution in that case in which character is already defined in program user doesn't want to give imput it is like user give all the input 
// in array and want that every first index of character is in uppercase or lowercase 
