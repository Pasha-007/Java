public class largest {  // Class name starts with an uppercase "L"
    public static int large(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int answer = large(8, 23, 214);
        System.out.println("The Largest number is: " + answer);
    }
}
