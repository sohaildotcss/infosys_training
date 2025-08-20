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
        String[] fruits = { "apple", "apple", "mango", "banana", "apple", "kiwi" };
        int idx = temp(fruits, "kiwi");
        if (idx == -1) {
            System.out.println("Fruit not found");
        } else {
            System.out.println("Fruit found at " + idx);
        }
    }
}