import java.util.Scanner;

public class LoginApp {
    public static String webSite = "=== Naver ===";
    private String id ;
    private String pw;
    private String name;

    public String login(String idParam, String pwParam, String nameParam) {
       id = idParam;
       pw = pwParam;
       name = nameParam;
        return "ID : "+ id+", Pw : "+ pw + ", Name :  "+ name;
    }

}





   