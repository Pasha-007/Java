package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> friendArrayList = 
        new ArrayList<>(Arrays.asList("John", "Chris", "Eric"));
        
        System.out.println(friendArrayList);
    }
}
