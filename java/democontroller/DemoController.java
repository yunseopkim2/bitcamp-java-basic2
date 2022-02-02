package democontroller;

import domain.*;
import service.*;

import java.util.Scanner;

public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bmi = new BmiDTO();
        BmiService bmiService = new BmiService();
        CalcService calcService = new CalcService();
        GoogleService googleService = new GoogleService();
        GreadeService gradeService = new GreadeService();
        LoginService loginService = new LoginService();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        while (true){
            System.out.println("메뉴선택");
            String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println(BmiDTO.BMI_APP + "\n이름 ,몸무게, 키");
                    bmi.setName(scanner.next());
                    bmi.setNum1(scanner.nextInt());
                    bmi.setNum2(scanner.nextInt());
                    res = bmiService. getBmi(bmi); break;
                case "2" :
                    System.out.println(CalcDTO.CALC_APP + "\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcade(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getCalc(calc); break;
                case "3":
                    System.out.println(GradeDTO.GRADE_APP + "\n검색");
                    google.setSerch(scanner.next());
                    res = googleService.getGoogle(google);break;

                case "4":
                    System.out.println(GradeDTO.GRADE_APP + "\n 이름, 국어, 영어, 수학");;
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.getGrade(grade); break;
                case "5" :
                    System.out.println(LoginDTO.LOGIN_APP + "\n 아이디, 비번, 이름");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = loginService.getLogin(login); break;
                default: res = "잘못된 입력입니다."; break;
            }
            System.out.println(res);
        }
    }
}
