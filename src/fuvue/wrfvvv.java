package fuvue;

public class wrfvvv {
    public static void main(String[]args){
        int x=10;
        int y=20;
        int z = (++x) + (y--); // int z = 1이 증가된 x값 + 해당 연산을 진행하고 1이 줄어들  y값을 더한 값이다.
        System.out.println(z); // 출력 값은 31
    }
}
