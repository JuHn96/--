package chap03_2;

/*
POINT: stop이 true일 때 반복을 멈추도록 while 조건은 '!stop'이어야 합니다.
*/
public class Fixed3Ex03_2 {
    public static void main(String[] args) {
        boolean stop = false;
        int count = 0;
        while(!stop) {
            System.out.println("count=" + count);
            if (count == 2) stop = true; // 예시로 2까지 출력 후 중단
            count++;
        }
        System.out.println("반복 종료");
    }
}
