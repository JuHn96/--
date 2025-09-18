package chap03_2;

import java.util.Scanner;

/*
POINTS
- 문자열 비교는 equals()
- 패스워드는 int로 변환 후 == 비교
*/
public class Fixed11Ex03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디:");
        String name = scanner.nextLine();

        System.out.print("패스워드:");
        String strPassword = scanner.nextLine();
        int password = Integer.parseInt(strPassword);

        if (name.equals("java")) {
            if (password == 12345) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패: 패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패: 아이디 존재하지 않음");
        }
    }
}
