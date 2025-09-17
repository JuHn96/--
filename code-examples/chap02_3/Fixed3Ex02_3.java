package chap02_3;

public class Fixed3Ex02_3 {
    public static void main(String[] args) {
        byte byteValue = 10;
        float floatValue = 2.5f;
        double doubleValue = 2.5;

        // byte result = byteValue + byteValue; // Error
        int result2 = 5 + byteValue;
        float result3 = 5 + floatValue;
        double result4 = 5 + doubleValue;

        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}