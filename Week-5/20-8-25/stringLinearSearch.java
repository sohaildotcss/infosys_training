public class stringLinearSearch {
    static int temp(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}