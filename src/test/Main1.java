package test;
//0이 하나면 도, 0이 두개면 개, 0이 세개면 걸, 0이 네개면 윷 , 1이 네개면 모, // 등이 1 배가 0
//완료
public class Main1 {
    public String solution(int[] arr1) {
        String answer = "";
        int a= 0 ;

            for(int j = 0 ; j<4; j++){ //윷의 갯수 4 // (등)1씩 들어갈때마다 카운트 //
                if (arr1[j] ==1){
                    a++;
                }

            if ( a == 0) { //배가 0
                answer ="윷";
            } else if (a==1){ //배가 3
               answer = "걸";
            }else if (a==2) { //배가 2
                answer ="개";
            }else if (a==3) { //배가 3
                answer ="도";
            }else if (a==4) { //배가 4
                answer ="모";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1 method = new Main1();
        int[] arr1 = {0,0,0,1};
        System.out.println(method.solution(arr1));
    }
}