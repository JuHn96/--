public class Fixed1Ex {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 'A';

        int intValue1 = byteValue;   // OK
        int intValue2 = charValue;   // OK
        // short shortValue = charValue; // Error
        double doubleValue = byteValue; // OK

        System.out.println(intValue1);
        System.out.println(intValue2);
        System.out.println(doubleValue);
    }
}