import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a =0;
        int b =1;
        int c =0;
        System.out.print(a + " " + b);
        for(int i =2; i <= n; i++){
            c = a + b;
            a=b;
            b=c;
           System.out.print(" "+b);
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n)); // Output: 55
    }
}