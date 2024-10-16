public class Fibonacci {

    public static void fibonacci(int n){
        int a = 0; 
        int b = 1;
        System.out.print(a);
        if(n > 1){
            System.out.print(", " + b);
        }
        for (int i = 2; i <= n; i++){
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
    public static void main(String[] args){
        fibonacci(5);
    }
}
