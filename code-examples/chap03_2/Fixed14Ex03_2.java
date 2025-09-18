package chap03_2;

public class Fixed14Ex03_2 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score > 90)) ? "가" : "나";
        System.out.println(result); // 가
    }
}
