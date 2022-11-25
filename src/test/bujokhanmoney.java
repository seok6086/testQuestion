package test;
import java.util.Scanner;
//
public class bujokhanmoney {

    public long solution(int price, int money, int count){
        long result = price*((long)count*(1+count)/2);

        if(result<=money){
            return 0;
        }
            else{
                return result - (long)money;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int price = sc.nextInt();
    int money = sc.nextInt();
    int count = sc.nextInt();
        long result = price*((long)count*(1+count)/2);

        if(result<=money){
            System.out.println(0);
        }
        else{
            System.out.println( result - (long)money);
        }
    }
}
