package grade;

import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        String name = scanner.next();
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();
        String grade = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(grade);

    }
}
