
    import java.util.Scanner;

public class LinearSearchDuplicate {
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

        boolean found = false;
        System.out.print("Element found at index: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
                found = true;
            }
        }

       
    }
}


