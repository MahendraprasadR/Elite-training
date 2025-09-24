public class LinearsearchAssignment {
    public static void main(String[] args) {
        int[] arr = {15, 25, 68, 98, 108, 117, 138, 578, 1, 2100};
        int target = 1;
        if (linearSearch(arr, target) == -1) {
            System.out.println("No such Element found!");
        } else {
            System.out.println("The element is present in: " + linearSearch(arr, target));
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}