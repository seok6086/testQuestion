package cwaa;

public class vedfs {
    public static void main(String[]args){
        while (true){
            int num1 =(int) (Math.random()*6)+1; //주사위 랜덤 번호 출력
            int num2 =(int) (Math.random()*6)+1;
            System.out.println("("+"("+num1+")"+","+"("+num2+")"+")");
            if((num1+num2) == 5 ){
                break;
            }
        }
    }
}
