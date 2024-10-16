public class Reverse {

    public static String reverse(String s){
        String reversedStr = "";
        for(int i = s.length()-1; i >= 0; i--){
            reversedStr += s.charAt(i);
        }
        return reversedStr;
    }
    public static void main(String[] args){
        System.out.println(reverse("Hello"));
    }
}
