public class arrays {

    static void storeMarks() {
        int[] marks = { 85, 90, 78, 92, 88 };
        for (int i = 1; i < marks.length; i++) {
            System.out.println("Student " + (i + 0) + " marks are " + ":" + marks[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 10;
        numbers[1] = 10;
        numbers[1] = 10;
        numbers[1] = 19;
        for (int num : numbers) {
            System.out.println(num);
        }
        storeMarks();
    }
}
