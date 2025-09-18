package chap03_2;

/*
FIX: byte 변수에 부호 연산(-)을 적용하면 피연산자가 int로 승격되어
     'b = -b;'에서 컴파일 오류가 발생합니다.
BEFORE:
    byte b = 5;
    b = -b;              // Type mismatch: cannot convert from int to byte
CHANGE:
    b = (byte)(-b);      // 결과를 byte로 캐스팅하여 대입
*/
public class Fixed1Ex03_2 {
    public static void main(String[] args) {
        byte b = 5;
        b = (byte)(-b);          // -5
        int result = 10 / b;     // 10 / -5 = -2
        System.out.println(result);
    }
}
