public class FibonacciRecursion {
    public static void main(String[] args) {
        int result = fibonaccicheck(7);
        System.out.println(result);
    }

    public static int fibonaccicheck(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonaccicheck(n - 1) + fibonaccicheck(n - 2);
        }
    }
}
