package member.domain;


public class CalcApp {
    public static String webSite = "Calc.com";
    private int num1;
    private int num2;
    private String opcode;

    public String calc(int num1Param,
                       String opcodeParam, int num2Param){
        num1 = num1Param;
        opcode = opcodeParam;
        num2 = num2Param;
        int result = num1 + num2;
        return num1 + " " + opcode + " " +num2 + " = " + result;
    }
}