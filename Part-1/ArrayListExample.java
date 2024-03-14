import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(345);
        list.add(567);
        list.add(234);
        System.out.println(list);
        System.out.println(list.contains(654));
    }
    
}
