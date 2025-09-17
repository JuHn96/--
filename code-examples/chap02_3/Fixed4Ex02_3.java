package chap02_3;

public class Fixed4Ex02_3 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
        int i1 = 3;
        int i2 = 4;

        // short result = s1 + s2; // Error
        int result = s1 + s2;
        int result2 = i1 + i2;

        System.out.println(result);
        System.out.println(result2);
    }
}