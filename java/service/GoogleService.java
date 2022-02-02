package service;

import domain.GoogleDTO;

public class GoogleService {
    public String getGoogle(GoogleDTO google){
        return String.format("%s을(를) 검색한 결과입니다.", google.getSerch());

    }
}
