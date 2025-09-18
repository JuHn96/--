package chap03_2;

/*
FIX: int끼리 나누면 소수점이 절사되어 5/2 == 2가 됩니다.
BEFORE:
    double var3 = var1 / var2;      // int/int -> 2.0 (잘림)
CHANGE:
    double var3 = (double)var1 / var2;  // 또는 var1 / 2.0
*/
public class Fixed5Ex03_2 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;

        // BEFORE
        // double var3 = var1 / var2;
        // int var4 = (int)(var3 * var2); // 4

        // AFTER
        double var3 = (double)var1 / var2;   // 2.5
        int var4 = (int)(var3 * var2);       // 5
        System.out.println(var4);
    }
}
