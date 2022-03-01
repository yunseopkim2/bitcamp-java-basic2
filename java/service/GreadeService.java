package service;

import member.domain.GradeDTO;

public class GreadeService {
    public String getGrade(GradeDTO grade){

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
}
