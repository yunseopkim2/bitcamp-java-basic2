package member.domain;

public class CalcDTO {
    public static String CALC_APP = "계산기";
    private int num1;
    private String opcade;
    private int num2;

    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public String getOpcade(){
        return opcade;
    }
    public void setOpcade(String opcade){
        this.opcade = opcade;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
}
