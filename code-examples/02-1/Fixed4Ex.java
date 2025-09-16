public class Fixed4Ex {
    public static void main(String[] args) {
        int v1 = 0;
        if (true) {
            int v2 = 0;
            if (true) {
                int v3 = 0;
                v1 = 1; v2 = 1; v3 = 1;
                v1 = v2 + v3; // v3가 유효한 블록 안에서 사용
            }
        }
        System.out.println(v1); // 출력: 2
    }
}
