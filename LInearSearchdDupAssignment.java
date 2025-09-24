
public class LInearSearchdDupAssignment {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 1, 7 };
        int target = 7;
        System.out.print(" The Element in" ); 
        linearSearch(arr, target);
    }
    static void linearSearch(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print(i+" ");
                found = true;
            }
        }
    }
}


