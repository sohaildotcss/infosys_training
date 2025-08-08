public class palindrome {
    static void isPalindrome() {
        String name = "racecar";
        String res = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            res = res + name.charAt(i);
        }
        System.out.println(name.equals(res));
    }

    public static void main(String[] args) {
        isPalindrome();
    }
}
