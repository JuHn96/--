/*
PROBLEM   : 04-2 확인문제 4번 (4x+5y=60의 모든 해, x,y<=10 자연수)
SOURCE    : 교재 정답 해설 참고
EXPECTED  : 조건 만족 (x,y) 쌍 출력
*/
package chap04_2;

public class Fixed4Ex04_2 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x + 5 * y) == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}