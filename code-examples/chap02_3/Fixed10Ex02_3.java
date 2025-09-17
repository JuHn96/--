package chap02_3;

public class Fixed10Ex02_3 {
    public static void main(String[] args) {
        String str1 = 2 + 3 + "";
        String str2 = 2 + "" + 3;
        String str3 = "" + 2 + 3;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}