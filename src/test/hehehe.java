package test;
// 정수들의 절댓값을 차례대로 담은 정수배열 엡솔루트, 정수들의 부호를 차례대로 담은 signs 실제 정수들의 합을 구하시오
public class hehehe {
  public int solution(int[]absolutes,boolean[] signs){
      int answer = 0 ;
      for(int i = 0 ; i<absolutes.length ; i++){
          if(signs[i]==true){
              answer += absolutes[i]; //정수들이 참일경우 실제 정수가 양수
          }else if(signs[i]==false){
              answer -= absolutes[i]; // 아닐경우 음수
          }
      }
      return answer;
  }
}
