package chap03_2;

/*
대입 연산자 축약 형태 예시
*/
public class Fixed13Ex03_2 {
    public static void main(String[] args) {
        int value = 0;

        // BEFORE
        // value = value + 10;
        // value = value - 10;
        // value = value * 10;
        // value = value / 10;

        // AFTER
        value += 10;
        value -= 10;
        value *= 10;
        value /= 10;

        System.out.println(value); // 0
    }
}
