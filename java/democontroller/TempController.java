package democontroller;

public class TempController {
    public static void main(String[] args) {
        System.out.println("팀별 과제를 출력하세요.");

        String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                            "정렬", "스택", "해시", "힙", "탐욕법",
                        "이분탐색", "큐", "그래프", "깊이우선탐색", "너비우선탐색",
                        "완전탐색", "DP"};
        String s = "";
        for(int i = 0; i<arr.length; i++){
            if (i%5==0){
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
        }
        System.out.println(s);
        s = "";
        System.out.println("팀장이 많은 과제만 출력하세요.");

        String b = "김윤섭";
        for (int i = 0; i<arr.length; i++ ){
            if(arr[i].equals(b)){
                for (int j = 0; j<arr.length;j++){
                    s+=arr[i + j*5] + ",";
                }
            }
        }
        System.out.println(s);

        s = "";
        System.out.println("큐를 담당한 사람을 출력하세요.");
        String c = "스택";
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals(c))
                System.out.println(arr[i]+ "담당한 사람"+ arr[i%5]);
        }
        System.out.println(s);

    }

}
