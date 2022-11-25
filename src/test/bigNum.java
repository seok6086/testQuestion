package test;

public class bigNum {
    public long solution(int a, int b){
        long answer= 0;
        long bigNum= 0 ;

        if(a<b){ //a가 b보다 작을경우
            bigNum = b;
            for(int i =b; i<=bigNum;i++){
                answer = answer +=i;
            }
        }else if(b<a){ //b가 a보다 작을 경우
            bigNum = a;
            for(int i = a ; i <= bigNum ; i++){
                answer = answer +=i;
            }
        }else if(a==b){  //a=b일경우
            answer=a;
        }
        return answer;
    }
}
