/*
PROBLEM   : 04-2 확인문제 3번 (주사위 두 개, 합이 5면 종료)
SOURCE    : 교재 정답 해설 참고
EXPECTED  : (1,4), (4,1), (2,3), (3,2) 중 하나에서 종료
*/
package chap04_2;

public class Fixed3Ex04_2 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int)(Math.random() * 6) + 1;
            int num2 = (int)(Math.random() * 6) + 1;
            System.out.println("(" + num1 + ", " + num2 + ")");
            if ((num1 + num2) == 5) {
                break;
            }
        }
    }
}