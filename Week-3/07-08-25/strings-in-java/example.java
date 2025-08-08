public class example {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b); //true
        System.out.println(a == c); //false
    }
}