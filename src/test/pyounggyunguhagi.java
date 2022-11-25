package test;
//정수를 담고있는 배열 arr의 평균 구하기
public class pyounggyunguhagi {
    public double solution(int[]arr){
        double answer = 0;
        for(int i = 0 ; i < arr.length ; i++){ //arr의 정수들을 다 가지고와버려
            answer += i; //다 더해준다 이 말이야.
        }
        return answer / arr.length; //그 값을 배열의 길이만큼 나눠버린단 말야
    }
}
