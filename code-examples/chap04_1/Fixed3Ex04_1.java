/*
PROBLEM   : 04-1 확인문제 3번
ISSUE     : (오류 없음) 주어진 if-else-if 로직 실행
EXPECTED  : "등급은 B입니다."
IMAGE PATH: images/04-1/Fixed3Ex.png
*/
package chap04_1;

public class Fixed3Ex04_1 {
    public static void main(String[] args) {
        int score = 85;
        System.out.print("등급은 ");
        if(score < 70) {
            System.out.print("D");
        } else if(score < 80) {
            System.out.print("C");
        } else if(score < 90) {
            System.out.print("B");
        } else {
            System.out.print("A");
        }
        System.out.println("입니다.");
    }
}
