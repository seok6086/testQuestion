package test;
//행렬의 덧셈 행과 열의 크기가 같은 두 행렬의 같은 행 같은 열의 값을 각 서로 더한다.
public class plusplusplus {
    public int[][] solution(int[][]arr1,int[][]arr2){
        int [][] answer = {};
        answer = arr1 ;
        for (int i = 0 ; i < arr1.length; i++){ // 전체 묶음 행렬을 잡아주고
            for(int j = 0; j<arr1[0].length; i++){ // 그 행렬 안에있는 정수들을 다시 잡아주고
                answer [i][j] += arr2[i][j]; //더하면 끝

            }
        }
        return answer;
    }
}
