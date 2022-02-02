package service;

import domain.CalcDTO;

public class CalcService {
    public String getCalc(CalcDTO calc){

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

}
