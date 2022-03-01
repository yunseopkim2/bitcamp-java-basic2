package service;

import member.domain.LoginDTO;

import static member.domain.LoginDTO.PASSWORD;

public class LoginService {
    public String getLogin(LoginDTO login){
        return (login.getPw().equals(PASSWORD)) ? String.format("%s 님 환영합니다. 로그인 성공",
                login.getName()) : String.format("%s님의 비밀번호가 틀립니다. 로그인 실패", login.getId(), login.getPw() );
    }
}
