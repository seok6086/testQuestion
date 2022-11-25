package test;

import java.util.Scanner;

//직사각형 별찍기
// 별 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해라.
public class heyhey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i<a ; i++){
            for(int j = 0; j<b; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
