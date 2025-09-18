package chap03_2;

public class Fixed4Ex03_2 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students; // 몫
        int pencilsLeft = pencils % students;       // 나머지

        System.out.println(pencilsPerStudent);
        System.out.println(pencilsLeft);
    }
}
