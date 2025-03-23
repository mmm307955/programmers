import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);//바구니 개수
        int[] basket = new int[N];
        int M = Integer.parseInt(firstLine[1]);;

        for(int i = 0; i < M; i++){
            String[] input = br.readLine().split(" ");
            int sB = Integer.parseInt(input[0]);
            int eB = Integer.parseInt(input[1]);
            int num = Integer.parseInt(input[2]);
            for(int j = sB-1; j < eB; j++){//num 즉 그 공 숫자 대입
                basket[j] = num;
            }
        }
        for(int i = 0; i < basket.length; i++){
            bw.write(basket[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}