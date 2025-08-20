public class binarySearch {
    // Binary Search: It is a searching algotihm that works on sorted arrays(in
    // ascending or desc order)
    // It's much faster than Linear Search
    // 1. Look at the middle Element.
    // 2. If the target is equal to the middle -> Found.
    // 3. If the target is smaller -> search in the left half.
    // 4. If the target is larger -> search in the right half.
    // 5. Repeat until you find or the sub array becomes empty.
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = low + high / 2;
        while (low <= high) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 100, 465, 45, 0, 94, 8, 956 };
        int temp = binarySearch(numbers, 20);
        System.out.println(temp);
    }

}
