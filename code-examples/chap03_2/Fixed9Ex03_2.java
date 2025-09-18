package chap03_2;

import java.util.Scanner;

/*
요구: 두 실수 입력 -> 첫번째/두번째 출력,
두 번째 수가 0.0 또는 0이면 "결과: 무한대"
*/
public class Fixed9Ex03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("두 번째 수: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("-------------------");
        if (num2 != 0.0) {
            double result = num1 / num2;
            System.out.printf("결과: %.2f%n", result);
        } else {
            System.out.println("결과: 무한대");
        }
    }
}
