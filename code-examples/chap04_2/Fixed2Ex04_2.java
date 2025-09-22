/*
PROBLEM   : 04-2 확인문제 2번 (1~100 중 3의 배수 합)
SOURCE    : 교재 정답 해설 로직 반영
EXPECTED  : "3의 배수의 합: 1683"
IMAGE PATH: images/04-2/Fixed2Ex.png
*/
package chap04_2;

public class Fixed2Ex04_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수의 합: " + sum);
    }
}
