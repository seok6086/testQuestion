package test;
//없는 숫자 더하기  numbers 에서 찾을 수 없는 0부터 9까지 숫자를 모두 찾아 더한 수를 찾으시오.
public class nonenumplus {
    public int solution(int[]numbers){
        int answer=45; // 0~9 더한 값은 45
        for(int i = 0; i < numbers.length; i++) // for문으로 numbers 내에 수를 다 찾아줌
            answer -= numbers[i]; //45 - numbers 안에 모든 수
            return answer; // 결과는 없는 수들에 전체 합



    }
}
