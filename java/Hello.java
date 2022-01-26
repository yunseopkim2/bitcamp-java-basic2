import java.util.Scanner;

public class Hello {
    static String id = "";
    static String pw = "";
    static String name = "";

     void Hello(){
        Scanner scanner = new Scanner(System.in);
        String website = "Naver";
        System.out.println(website);
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        System.out.println("name");
        String name = scanner.next();

        System.out.println("welcome");
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.Hello();
    }
}
