package member.domain;

public class LoginDTO {
    public static String LOGIN_APP = "로그인";
    private String id;
    private String pw;
    private String name;
    public static String PASSWORD = "abc";

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getPw(){
        return pw;
    }
    public void setPw(String pw){
        this.pw = pw;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
