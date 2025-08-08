public class tokenizationFormatting {
    static void tokenization() {
        String list = "ferrrai,lamborghini,supra";
        String[] cars = list.split(",");
        for (String car : cars) {
            System.out.println(car);
        }
    }

    static void stringFormatting() {
        String myStr = "Hello %s! One kilobyte is %,d bytes.";
        String result = String.format(myStr, "World", 1024);
        System.out.println(result);
        // another way:
        System.out.printf("Hello %s, How are %s?", "world", "you");
    }

    public static void main(String[] args) {
        tokenization();
        stringFormatting();
    }
}
