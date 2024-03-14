import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int salary = in.nextInt(); 
       /*  if(salary>30000){
            salary = salary + 1000;
        }
        else{
            salary = salary+500;
        }*/


        //Multiple if-else
        if(salary>10000){
            salary += 2000;
        }else if(salary>12000){
            salary += 4000;
        }else{
            salary += 7000;
        }
        System.out.println(salary);
    }
    
}
