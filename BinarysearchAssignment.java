public class BinarysearchAssignment {
    public static void main(String[] args) {

        int[] arr = {900, 786, 654, 421, 309, 200, 177, 101, 21, 11};
        int target = 900;


        if (binarySearch(arr, target) == -1) {
            System.out.println("No such element is found in array");
        } else {
            System.out.println("The element is present in: " + binarySearch(arr, target));
        }

    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}