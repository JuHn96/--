/*
PROBLEM   : 04-1 확인문제 4번
ISSUE     : C case에 break가 없어 D까지 출력되는 fall-through 확인
FIX       : (학습 포인트) break가 없으면 아래 case로 진행됨
EXPECTED  :
    어떤 혜택을 원하세요?
    우수 회원 혜택을 받으실 수 있습니다.
    일반 회원 혜택을 받으실 수 있습니다.
    감사합니다.
IMAGE PATH: images/04-1/Fixed4Ex.png
*/
package chap04_1;

public class Fixed4Ex04_1 {
    public static void main(String[] args) {
        System.out.println("어떤 혜택을 원하세요?");
        char grade = 'C';
        switch(grade) {
            case 'A': System.out.println("VIP 회원은 드릴 수 있습니다."); break;
            case 'B': System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
            case 'C': System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
            case 'D': System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
            default: System.out.println("혜택이 없습니다.");
        }
        System.out.println("감사합니다.");
    }
}
