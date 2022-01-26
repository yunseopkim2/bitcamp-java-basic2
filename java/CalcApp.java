import java.util.Scanner;

public class CalcApp {

    public  static String webSite = "Calc.com";
    private int num1;
    private String opcode;
    private int num2;

   public String calc(int num1Param, String opcodeParam, int num2Param){
       num1 = num1Param;
       num2 = num2Param;
       opcode = opcodeParam;
       int result = num1 + num2;

        return num1 +" "+opcode +" " + num2 + " = "+ result;
    }

}
