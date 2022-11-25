package test;
//n의 값이 12345
// [5,4,3,2,1]
//n의 값을 10으로 나눠주는거지 그럼 나머지가 나올거아냐 제일먼저 5가 나올거고
//

//자연수 n (long)을 뒤집음.
// 뒤집은 숫자를 하나하나씩 배열에 집어넣어달라.
public class changenum {

public static void main(String[]args) {

    long n = 12345;

    String a = ""+n;

    int[] answer = new int[a.length()];

    int i = 0;

    while(n!=0){

        answer[i]=(int)(n%10);

        n/=10;

        i++;
    }

System.out.println(answer[i]);


}}