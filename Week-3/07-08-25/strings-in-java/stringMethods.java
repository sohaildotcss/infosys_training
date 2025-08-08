
public class stringMethods {
    public static void main(String[] args) {
        String s = "Programming";
        String s2 = "programming";
        System.out.println(s.charAt(5));
        System.out.println(s.codePointAt(5));
        System.out.println(s.codePointBefore(5));
        System.out.println(s.codePointCount(0, 5));
        System.out.println(s.compareTo(s2)); // -32
        System.out.println(s.compareToIgnoreCase(s2)); // 0
        String firstName = "Sohail";
        String lastName = "Shaik";
        System.out.println(firstName + " " + lastName);
        String a = "Hello";
        System.out.println(a.contains("lo")); // true
        System.out.println(a.contentEquals("Helloworld")); // false
        char[] mystr1 = { 'S', 'O', 'H', 'A', 'I', 'L' };
        String mystr2 = "";
        mystr2 = mystr2.copyValueOf(mystr1, 0, 6);
        System.out.println(mystr2);
        System.out.println(s.endsWith("ng"));
        System.out.println(s.equals(s2)); // false
        System.out.println(s.equalsIgnoreCase(s2)); // true
        

    }
}
