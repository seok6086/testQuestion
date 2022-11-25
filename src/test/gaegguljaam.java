package test;
// 정수 x와 자연수 n을 입력받아, x부터 시작해 x 씩 증가하는 숫자를 n개 지니는 리스트를 리턴하여라.
public class gaegguljaam {
    public long[] solution(long x , int n ){
        long[] answer = new long[n];
        for (int i = 0 ; i<n ; i++) {
            answer[i] = x * (i + 1);
        }
        return answer;
    }
}
