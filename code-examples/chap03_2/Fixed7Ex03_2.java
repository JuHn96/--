package chap03_2;

/*
FIX: 부동소수점(특히 float) 비교를 '=='로 하면 오차 때문에 실패할 수 있습니다.
BEFORE:
    float var1 = 10f;
    float var2 = var1 / 100;     // 0.1이 '정확히' 아님
    if (var2 == 0.1) { ... }   // false
CHANGE:
    Math.abs(var2 - 0.1f) < 1e-6f  // 허용 오차로 비교
*/
public class Fixed7Ex03_2 {
    public static void main(String[] args) {
        float var1 = 10f;
        float var2 = var1 / 100;           // 약 0.1
        if (Math.abs(var2 - 0.1f) < 1e-6f) {
            System.out.println("10%입니다.");
        } else {
            System.out.println("10%가 아닙니다.");
        }
    }
}
