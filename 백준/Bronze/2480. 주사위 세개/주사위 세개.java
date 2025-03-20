import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int price = 0;

        if(A == B && B ==C){
            price = 10000 + A * 1000;
        }

        else if(A == B){
            price = 1000 + A * 100;
        }

        else if(A == C){
            price = 1000 + A * 100;
        }

        else if(C == B){
            price = 1000 + B * 100;
        }

        else{
            int max = Math.max(A, B);
            max = Math.max(max, C);
            price = max * 100;
        }

        System.out.println(price);
    }
}