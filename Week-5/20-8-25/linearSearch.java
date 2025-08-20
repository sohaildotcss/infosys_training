public class linearSearch {
    static int temp() {
        int[] arr = { 8, 5, 9, 1, 6, 7 };
        for (int nums : arr) {
            if (nums == 1) {
                return nums;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        if (temp() == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found " + temp());
        }
    }
}