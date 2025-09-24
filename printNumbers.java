import java.util.Scanner;
public class printNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        display(n);
    }
    public static void display(int n){
        if (n<=0)
        {
            return;
        }
        else{
            System.out.println(n);
            display(n-1);
            System.out.println(n);
        }
    }
}