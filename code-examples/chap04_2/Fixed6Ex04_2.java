/*
PROBLEM   : 04-2 확인문제 6번 (오른쪽 정렬 삼각형)
SOURCE    : 교재 정답 해설 참고
EXPECTED  :
   *
  **
 ***
****
IMAGE PATH: images/04-2/Fixed6Ex.png
*/
package chap04_2;

public class Fixed6Ex04_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}