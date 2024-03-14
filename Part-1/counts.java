import java.util.*;
public class counts {// JAVA Code to count number of
    // digits in an integer
    
    
   
    
        static int countDigit(long n)
        {
            return (int)Math.floor(Math.log10(n) + 1);
        }
    
        /* Driver code */
        public static void main(String[] args)
        {
            long n = 345289467;
            System.out.print("Number of digits : "
                            + countDigit(n));
        }
    }
    // This code is contributed by Arnav Kr. Mandal.
    
    

