public class typeConversion {
    public static void main(String[] args) {
        int intVal = 12;
        byte byteVal = 127;
        // byteVal = intVal; // err, because byte has a short range and it cannot be converted to int.
        intVal = byteVal; 
    }
}
