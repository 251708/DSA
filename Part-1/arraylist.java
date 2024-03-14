import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(15);
        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        for(int i = 0; i<5; i++){
            System.out.println(list.get(i));//pass index here,list[index] syntax will not work here 
        }
        System.out.println(list);
    }
    
}
