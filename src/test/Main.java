package test;

//완료

public class Main {
    public void solution(int star) {


        for (int i = 0; i < star; i++) { //9번 반복해주기
            for (int j = 0; j < star - i; j++) {
                System.out.print(" "); //8,7,6,5,4,3,2,1,0 칸씩 공백
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); //별의 갯수 더해주기
            }
            System.out.println(); // 반복시 한칸씩 내려가게하기.
        }
    }

    public static void main(String[] args) {
        Main method = new Main();
        int star = 9;
        method.solution(star);
    }
}