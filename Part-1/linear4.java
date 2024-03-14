import java.util.Arrays;

public class linear4 {
    public static void main(String[] args) {
        String name = "Sakshi";
        char target = 'k';
       // System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    /* 
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    */

    //this can also be done with enhanced for loop
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch :str.toCharArray()){
            if(ch== target){
                return true;
            }
        }
        return false;
    }
    
}
