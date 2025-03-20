import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        A += (C / 60);//시간 사이클 만큼 더해준다.
        B += (C % 60);//나머지 분을 더해준다.

        if(B >= 60) {
            A++;
            B -= 60;
        }
        if(A >= 24){
            A -= 24;
        }
        System.out.println(A + " "+ B);
    }
}