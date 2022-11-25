package test;

import java.util.Arrays;


// 배열 안에서 제일 큰 수를 * 처리하고 // 배열에[I]번째에 있는 숫자들끼리 비교해서 * 처리하면 된다.
// * 부분을 int 100으로 맥여주고
// 배열을 String으로 바꿔주면서 100 이라는 숫자를 *로 바꿔버린다 .
public class Main3 {
    public void solution(int[][] arr1) {
        int[][] answer = new int[5][5] ; //배열 선언
        int[][] check = new int[5][5];
        for(int i = 0 ; i< arr1.length;i++){
            if(arr1[0][i]>8){
               arr1[0][i]=100;

            }else if(arr1[1][i]>5){
                arr1[1][i]=100;
            }else if(arr1[2][i]>8){
                arr1[2][i]=100;
            }else if(arr1[3][i]>5){
                arr1[3][i]=100;
            }else if(arr1[4][i]>7){
                arr1[4][i]=100;
            }
//            System.out.print(arr1[0][i]);
//            System.out.print(arr1[1][i]);
//            System.out.print(arr1[2][i]);
//            System.out.print(arr1[3][i]);
////            System.out.print(arr1[4][i]);
//            System.out.println(Arrays.toString(arr1));
            String str1 = String.valueOf(arr1);
            System.out.println(arr1);
        }


    }

    public static void main(String[] args) {
        Main3 method = new Main3();
        int[][] arr1 = {{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}};

        method.solution(arr1);
    }
}