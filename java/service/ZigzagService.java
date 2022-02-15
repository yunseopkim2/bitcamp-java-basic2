package service;

import java.util.Random;

public class ZigzagService {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        int[][] number = new int[a][a];
        int count = 1;

        for(int i = 0; i<a; i++){
            if((i%2)==0){
                for (int j = 0; j<a; j++){
                    number[i][j] = count;
                    count++;
                }
            }else{for(int j = a-1; j>=0; j--){
                number[i][j] = count;
                count++;
            }

            }
        }
        for(int i =0; i<a; i++){
            for(int j = 0; j<a; j++){
                System.out.print(number[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}