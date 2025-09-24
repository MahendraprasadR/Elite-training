import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int[] arr = { 70, 90, 120, 150, 200 };
        System.out.println("enter arrau size");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the element");
        int value = scan.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int pos = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (value == arr[mid]) {
                pos = mid;
                break;
            } else if (value < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (pos == -1) {
            System.out.println("element is not present in array");
        } else {
            System.out.println("Element is found at " + pos);
        }

    }
}
