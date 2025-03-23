import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//바구니 개수
        int[] basket = new int[N];
        int M = sc.nextInt();
        //i는 M번의 공넣기를 할 것을 의미
        for(int i = 0; i < M; i++){
            int sB = sc.nextInt();//넣기 시작할 바구니
            int eB = sc.nextInt();//넣기 끝나는 바구니
            int num = sc.nextInt();//넣을 공 숫자
            for(int j = sB-1; j < eB; j++){//num 즉 그 공 숫자 대입
                basket[j] = num;
            }
        }
        for(int i = 0; i < basket.length; i++){
            System.out.print(basket[i] + " ");
        }

    }
}