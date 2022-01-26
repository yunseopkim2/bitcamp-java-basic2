import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        HelloApp helloApp = new HelloApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Id:  ");
        System.out.println("Input Pw:  ");
        System.out.println("Input Name:  ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        System.out.println("Ouput:  ");
        helloApp.hello(id,  pw, name);
    }
}
