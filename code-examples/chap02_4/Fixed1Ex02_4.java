package chap02_4;

public class Fixed1Ex02_4 {
    public static void main(String[] args) {
        String name = "감자바";
        int age = 25;
        String tel1 = "010", tel2 = "123", tel3 = "4567";

        // 이름 출력
        System.out.println("이름: " + name);

        // 나이 출력 (print 사용 후 개행 추가)
        System.out.print("나이: " + age + "\n");

        // 전화번호 출력 (printf 사용)
        System.out.printf("전화: %s-%s-%s", tel1, tel2, tel3);
    }
}
