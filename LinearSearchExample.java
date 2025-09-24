import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.print("Enter element to search: ");
        int key = scan.nextInt();
        
        int pos = -1;  
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.println("Element found at index " + pos);
        } else {
            System.out.println("Element not found");
        }
    }
}
