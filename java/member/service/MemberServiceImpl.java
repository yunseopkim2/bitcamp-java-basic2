package member.service;

import member.domain.*;

import static member.domain.LoginDTO.PASSWORD;

public class MemberServiceImpl implements MemberService{
    @Override
    public String getBmi(BmiDTO bmi) {
        return null;
    }

    @Override
    public String getCalc(CalcDTO calc) {
            int res = 0;
            switch (calc.getOpcade()){
                case "+":
                    res = calc.getNum1() + calc.getNum2(); break;
                case "-":
                    res = calc.getNum1() - calc.getNum2(); break;
                case "*":
                    res = calc.getNum1() * calc.getNum2(); break;
                case "/":
                    res = calc.getNum1() / calc.getNum2(); break;

            }
            return String.format("%d %s %d = %d " , calc.getNum1(), calc.getOpcade(), calc.getNum2(), res);
        }


    @Override
    public String getGoogle(GoogleDTO google) {
        return String.format("%s을(를) 검색한 결과입니다.", google.getSerch());

    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >=60) ? "합격" : "불합격";
        return String.format("%s \n +" +
                        "이름 : %s\n" +
                        "국어 : %d\n" +
                        "영어 : %d\n" +
                        "수학 : %d\n"+
                        "총점 : %d\n" +
                        "평균 : %d\n" +
                        "합격여부 : %s" ,GradeDTO.GRADE_APP, grade.getName(), grade.getKor(), grade.getEng(),grade.getMath(),
                total,
                avg,
                pass
        );
    }



    @Override
    public String getLogin(LoginDTO login) {
        return (login.getPw().equals(PASSWORD)) ? String.format("%s 님 환영합니다. 로그인 성공",
                login.getName()) : String.format("%s님의 비밀번호가 틀립니다. 로그인 실패", login.getId(), login.getPw() );
    }

}
