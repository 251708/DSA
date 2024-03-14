public class comparison {
    public static void main(String[] args) {
        String a = "Sakshi";
        String b = "Sakshi";
       // System.out.println(a == b);

//value are same bt this gives false bcoz it may be pointing to the diffeerent objects bcoz it is explicitly mentioned
       String name1 = new String("Sakshi");
       String name2 = new String("Sakshi");
       //System.out.println(name1 == name2);//it is a comparator
      System.out.println(name1.equals(name2));//it is a method whether the reference variable is pointing to the same object or not it is just check the value
    }


    
}
