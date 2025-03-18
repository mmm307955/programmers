import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        //B의 첫번째 자리(5) 구해서 A * 일의 자리 계산
            // first = 일의 자리 계산
            int first = B - (((B/100)*100) + ((B/10 - (B/100)*10)*10));
        System.out.println(A * first);
        //B의 가운데 자리(8) 구해서 A * 십의 자리 계산
            // second = 십의 자리 계산
            int second = (B/10) - (B/100)*10;
        System.out.println(A * second);
        //B의 마지막 자리(5) 구해서 A * 백의 자리 계산
        System.out.println(A * (B/100));
        //최종 곱
        System.out.println(A * B);
    }

}