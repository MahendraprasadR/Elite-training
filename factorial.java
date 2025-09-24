
public class factorial {
    public static void main(String[] args) {
        int result = factorialcheck(5);
        System.out.println(result);
    }

    public static int factorialcheck(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialcheck(n - 1);

        }

    }
}
