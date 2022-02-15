package service;

public class MagicSquare {
    public static void main(String[] args) {
        for(int i = 2; i <10; i +=4){
            for(int j = 1; j <= 9; j++){
                for(int k = i; k<i+4; k++){
                    System.out.print(k + "*" + j + "="+(k*j)+"\t");
                }
                System.out.print("\n");
            }
            System.out.println("\n");
        }
    }
}
