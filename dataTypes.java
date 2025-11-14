public class dataTypes {
    public static void main(String[] args){
        // Primitive Data types: int, byte, short, long, float, double

        // Numeric data types
        byte byteNum = 100;
        short shortNum = 10000;
        int intNum = 1000000000;
        long longNum = 1000000000L; // Value must end with l/L for long type
        float floatNum = 768.9857f; // value must end with f for float data type.
        double doubleNum = 65.675d; // value ends with d for double type

        boolean dataKind = true;

        // Character data type
        char charType = 'A';

        System.out.println("Numeric data types:" + dataKind);
        System.out.printf("\nByte (8-bit): %d",byteNum);
        System.out.printf("\nShort (16 - bit): %d", shortNum);
        System.out.printf("\nInteger (32-bit): %d", intNum);
        System.out.printf("\nLong (64-bit): %d", longNum);
        System.out.printf("\nFloat (32-bit decimals): %f", floatNum);
        System.out.printf("%nDouble (64-bit decimals): %f %n", doubleNum);
        System.out.println("====================");
        System.out.printf("Character: %s",charType);
    }
}
