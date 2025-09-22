package chap05_1;

public class Fixed5Ex05_1 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 10;
        String var3 = "AB";
        String var4 = "AB";
        String var5 = new String("AB");

        System.out.println(var1 == var2);        // true : 기본 타입 값 비교
        System.out.println(var1 != var2);        // false
        System.out.println(var3 == var4);        // true  : 상수 풀 공유
        System.out.println(var3 != var5);        // true  : 서로 다른 객체
        System.out.println(var4.equals(var5));   // true  : 내용 비교는 equals
    }
}
