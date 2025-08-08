import java.util.Scanner;
import java.lang.NumberFormatException;

public class mockTest {
    static void anagrams() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Both strings are anagrams.");
        } else {
            System.out.println("Strings are NOT anagrams.");
        }
    }

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;

    }

    static void RemoveDuplicateChars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == ' ') {
                result.append(' ');
            } else if (!seen[current]) {
                result.append(current);
                seen[current] = true;
            }
        }

        System.out.println("After removing repeated letters: " + result.toString());
    }

    static void accessArray() {
        int[] array = { 10, 52, 1, 51 };
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an index number which you want to access: ");
            String input = sc.next();
            int i = Integer.parseInt(input);
            System.out.println(array[i]);
            sc.close();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occurred");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Occurred");
        }
    }

    public static void main(String[] args) {
        anagrams();
        RemoveDuplicateChars();
        accessArray();
    }
}
