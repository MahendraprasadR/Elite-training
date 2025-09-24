import java.util.Scanner;

public class InsertionSortAssignment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
