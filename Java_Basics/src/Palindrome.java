public class Palindrome {

    public static boolean palindrone(String s){
        char b = s.charAt(0);
        if( b == s.charAt(s.length()-1)){
            return true;   
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(palindrone("Not madam"));
    }
}
