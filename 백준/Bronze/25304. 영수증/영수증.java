import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();//총 금액
        int N = sc.nextInt();//구매한 물건의 종류의 수
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            int a = sc.nextInt();//각 물건의 가격
            int b = sc.nextInt();//개수
            sum += a * b;
        }

        if(X == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}