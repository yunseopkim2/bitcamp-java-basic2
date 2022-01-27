package algorithm;

import java.util.Scanner;

public class AlgoController {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("[Menu] 0.exit\n" +
                        "[김윤섭] 1. stack \t" +
                        "2. queue \t" +
                        "3. dp \n" +
                        "[최민서] 4. hash \t" +
                        "5. graph \t" +
                        "6. greedy \n" +
                        "[한정수]7. dfs \t" +
                        "8. bfs \t" +
                        "9. heap \n" +
                        "[김승현] 10. bin search \t" +
                        "11. brute force\t" +
                        "12. sort\t");
                switch (scanner.next()){
                    case "0": return;
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                    case "10":
                    case "11":
                    case "12":
                    default:
                        System.out.println("Wrong Number");break;
                }
            }

        }
}
