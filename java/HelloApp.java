import java.util.Scanner;

public class HelloApp {
  String id = "";
  String pw = "";
  String name = "";

    public void hello(String paramid,  String parampw,  String paramname) {

      id = paramid;
      pw = parampw;
      name = paramname;
        System.out.println("ID "+id+" pw "+pw+" Name "+name);

    }
}
