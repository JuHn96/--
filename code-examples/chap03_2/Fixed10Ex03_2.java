package chap03_2;

/*
FIX: 3*14가 정수 곱셈으로 42가 되어 면적 계산이 잘못됨.
BEFORE:
    int var1 = 10;
    int var2 = 3;
    int var3 = 14;
    double var4 = var1 * var1 * var2 * var3;    // 10*10*42
CHANGE:
    double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3); // 3.14 사용
*/
public class Fixed10Ex03_2 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 3;
        int var3 = 14;
        double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
        System.out.println("원의 넓이: " + var4);
    }
}
