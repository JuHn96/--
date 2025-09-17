package chap02_4;

import java.util.Scanner;

public class Fixed2Ex02_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수:");
        String strNum1 = scanner.nextLine();

        System.out.print("두 번째 수:");
        String strNum2 = scanner.nextLine();

        // 문자열을 int로 변환
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println("덧셈 결과: " + result);

        scanner.close(); // 자원 해제
    }
}
