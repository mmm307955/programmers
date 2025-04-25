import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = 1;
        int Y = 1;
        int dir = 1;//대각선 위
        int count = 1;
        while(count<N){
            if(X == 1 && Y % 2 == 1){
                //X는 1, Y는 홀수일 때 오른쪽으로 이동
                Y++;
            }else if (X == 1 && Y % 2 == 0){
                X++;
                Y--;
                dir = -1;
            }else if(Y == 1 && X % 2 == 0){
                X++;
            }else if(Y == 1 && X % 2 == 1){
                X--;
                Y++;
                dir = 1;
            }else if(dir == 1){
                X--;
                Y++;
            }else if(dir == -1){
                X++;
                Y--;
            }
            count++;
        }
        System.out.println(X + "/" +Y);
    }
}
