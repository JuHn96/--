public class Fixed2Ex {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String strValue = "A";

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;
        // char var4 = (char) strValue; // Error

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }
}