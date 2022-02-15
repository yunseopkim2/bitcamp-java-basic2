package service;

public class GugudanService {
    public static void main(String[] args) {
        for (int dan = 2; dan < 10; dan += 4){
            for (int i = 1; i <= 9; i++){
                for (int j = dan; j < dan+4; j++){
                    System.out.print(j + "*" + i + "="+(j * i)+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
