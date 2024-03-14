import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(); 
      for(int num = 1; num<=n; num +=1){
        System.out.println("Hello World");
      } 
    }
    
}


//Syntax of for loop
/*
 for(initialisation;condition;increment/decrement){
    body
 }
 */
/*
  for(int num= 1; num<= n; num +=1){
  System.out.println();
   }
 */  

 //Syntax for while loop
 /*
  intialisation;
  while(condition){
    body
  }
  */

  /*
   int num = 1;
   while(num<=n){
    System.out.println(num);
    num+=1;
   }
   */
  //Syntax for do while loop
  /*
  int n = 1;
  do{
    System.out.println("");
  }while(n!=1);
   
   */