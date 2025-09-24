import java.util.Scanner;

public class PowerofaNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(power(a, b));
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
                return a*power(a, b-1);
        }
    }

}
