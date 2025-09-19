/*
PROBLEM   : 04-2 확인문제 7번 (while+Scanner: 예금/출금/잔고/종료)
SOURCE    : 교재 정답 해설 참고
EXPECTED  : 예금/출금/잔고 동작 후 4 선택 시 "프로그램 종료"
IMAGE PATH: images/04-2/Fixed7Ex.png
*/
package chap04_2;

import java.util.Scanner;

public class Fixed7Ex04_2 {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택> ");

            int menuNum = Integer.parseInt(scanner.nextLine());

            switch (menuNum) {
                case 1:
                    System.out.print("예금액> ");
                    balance += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance -= Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}