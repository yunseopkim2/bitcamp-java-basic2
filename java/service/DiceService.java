package service;

import java.util.Random;

/**
 * 1.6면인 주사위를 5회 굴려서 나온 합계를 구하기
 * (int)(Math.random() *최대값)+최솟 값 --> 클래스 메소드 방식
 * 2.홀수 나올때까지 합계 구하기
 * Random random = new Random(); --> 인스턴스 메소드 방식
 * 3. 플레이어(Math 랜덤값)와 컴퓨터(Random 랜덤값) 주사위 굴리기를 해 이기면
 * 	     "You Win!", 비기면 "Draw.", 지면 "You Lose!"를 출력하세요.
 */
public class DiceService {
    public static void main(String[] args) {
 //1번
        int res = 0;
        for(int i = 0; i<5; i++){
            double d = Math.random();
            int temp = (int) (d * 6) +1; //랜덤으로 (1-6) 정수값
            System.out.println(temp);
            res += temp;

        }
        System.out.println("주사위를 5회 굴려서 나온 합계 : " + res);
      //2번 메모리가 계속해서 사용된다.
        Random random = new Random();
        int res2 = 0;
        while(true){
            int r = random.nextInt(5)+1;
            System.out.println("dice value : " + r);
            if(r%2 != 0){

                break;
            }
            res2 += r;
        }

        System.out.println(res2);
       // 3. 플레이어(Math 랜덤값)와 컴퓨터(Random 랜덤값) 주사위 굴리기를 해 이기면
 	    // "You Win!", 비기면 "Draw.", 지면 "You Lose!"를 출력하세요.

        int a = (int)(Math.random()*6)+1;
        System.out.println("플레이어 숫자: "+a);
        int b = new Random().nextInt(5)+1;
        System.out.println("컴퓨터 숫자: "+b);
        String s = "Draw.";
        if(a != b) s = (a>b) ? "You Win!" : "You Lose!" ;

        System.out.println(s);
    }



}
