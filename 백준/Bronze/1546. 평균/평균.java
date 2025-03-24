import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] score = new int[N];
        for(int i = 0; i < N; i++){
            score[i] = sc.nextInt();
        }

        //score에서 가장 높은 점수를 구해 max에 저장
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            if(max < score[i]) max = score[i];
        }

        int scoreSum = 0;
        for(int i = 0; i < N; i++){
            scoreSum += score[i];
        }

        double fakeScore =  (100 * ((double)scoreSum/max)/N);
        System.out.println(fakeScore);

    }
}
