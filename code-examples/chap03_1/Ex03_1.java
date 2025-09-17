package chap03_1;

public class Ex03_1 {
    public static void main(String[] args) {
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;

        int result1 = var1 + var2 * var3;      // 곱셈 우선
        int result2 = (var1 + var2) * var3;    // 괄호 먼저

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}