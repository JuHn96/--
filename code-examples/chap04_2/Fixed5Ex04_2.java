/*
PROBLEM   : 04-2 확인문제 5번 (왼쪽 정렬 삼각형)
SOURCE    : 교재 정답 해설 참고(줄바꿈을 j==i에서 수행)
EXPECTED  :
*
**
***
****
IMAGE PATH: images/04-2/Fixed5Ex.png
*/
package chap04_2;

public class Fixed5Ex04_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j == i) {
                    System.out.println();
                }
            }
        }
    }
}