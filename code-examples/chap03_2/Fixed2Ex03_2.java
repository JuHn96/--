package chap03_2;

public class Fixed2Ex03_2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);   // x: 11, y: 19 (식 평가 시 20 사용)
        System.out.println(z);   // 31
    }
}
