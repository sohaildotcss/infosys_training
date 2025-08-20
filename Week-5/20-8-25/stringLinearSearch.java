import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        System.out.println("How many fruits do you want to add:");
        int numberOfFruits = s.nextInt();
        String[] fruits = new String[numberOfFruits];
        System.out.println("Enter a fruit");
        String temp = s.nextLine();
        fruits.add(temp);
        int idx = temp(fruits, "kiwi");
        if (idx == -1) {
            System.out.println("Fruit not found");
        } else {
            System.out.println("Fruit found at " + idx);
        }
    }
}