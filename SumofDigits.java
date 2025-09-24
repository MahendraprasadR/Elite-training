import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofdigit = sumFunction(n);
        System.out.print(sumofdigit);
    }

    public static int sumFunction(int n) {
        if (n == 0) {
            return 0;
        } else {
            int digit = n % 10;
            int sum = digit + sumFunction(n / 10);

            return sum;
        }
    }
}
