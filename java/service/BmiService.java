package service;

import domain.BmiDTO;

public class BmiService {
    public String getBmi( BmiDTO bmi) {
        return String.format("%s 님은 정상입니다.", bmi.getName());
    }
}
