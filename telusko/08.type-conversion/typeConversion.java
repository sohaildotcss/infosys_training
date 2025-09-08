public class typeConversion {
    public static void main(String[] args) {
        byte temp = 20;
        int temp2 = temp;
        System.out.println(temp2); // Implicit Conversion

        int intVal = 12;
        byte byteVal = 127;
        // byteVal = intVal; // err, because byte has a short range and it cannot be
        // converted to int.
        intVal = byteVal;

        int a = 300;
        byte b = (byte) a; // Explicit Conversion. here, the int value is out of range of byte
        // value(256),so it will do a modulous operation and the remainder is being
        // stored in the variable, in this case b.
        System.out.println(b); // 44 (300%256)

        float f = 23.38f;
        // int x = f; // You can't directly do like this.
        int x = (int) f;
        System.out.println(x); // 23, you will lose the decimal values

        // ! Type Promoting
        byte k = 30;
        byte l = 10;
        int z = k * l; // here the result will go out of range so it will be
        // automatically promoted to an int. and we can store that directly to int.
        System.out.println(z);

    }
}
