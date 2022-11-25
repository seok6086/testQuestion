package test;
import java.util.Scanner;
// 기원은 항해 99를 오늘자로 시작하였다. 항해1차로부터 언제 수료할지 궁금하다.
// 항해 1일차 날짜를 입력하면 98일 이후 수료하는 날짜를 알려주는 알고리즘을 만들어라 .
// 항해에 들어온 날짜
public class testtestt {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int startMonth = sc.nextInt();
        int startDay = sc.nextInt();
        int [] month;
        month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum= 0;
        for(int i = 0 ; i<=startMonth-1; i++){
            sum +=month[i];
            int a= sum;
            int nowDate = a + (startDay-1); //49일
            int clearDate = (nowDate+98);
            System.out.println("문제있는 부분" + sum);


            if(clearDate<=59){ //1월
                System.out.println(1+"월"+(31-clearDate)+"일");
            }else if(clearDate <90 ) {//2월
                System.out.println(2 + "월" + (59 - clearDate) + "일");
            }else if(clearDate<120){//3월
                System.out.println(3 + "월" + (90 - clearDate)+ "일");
            }else if(clearDate<151) {//4월
                System.out.println(4 + "월" + (120 - clearDate) + "일");
            }

            else if(clearDate<182) {//5월 /////////////////////////////////////
                System.out.println(5 + "월" + (151 - clearDate) + "일");
            }else if(clearDate<212) {//6월
                System.out.println(6 + "월" + (182 - clearDate) + "일");
            }else if(clearDate<243) {//7월
                System.out.println(7 + "월" + (212 - clearDate) + "일");
            }else if(clearDate<274) {//8월
                System.out.println(8 + "월" + (243 - clearDate) + "일");
            }else if(clearDate<304) {//9월
                System.out.println(9 + "월" + (274 - clearDate) + "일");
            }else if(clearDate<335) {//10월
                System.out.println(10 + "월" + (304 - clearDate) + "일");
            }else if(clearDate<365) {//11월
                System.out.println(11 + "월" + (335 - clearDate) + "일");
            }else if(clearDate<396) {//12월
                System.out.println(12 + "월" + (360 - clearDate) + "일");
            }



        }

    }
}
