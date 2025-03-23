import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);//바구니 개수
        int[] basket = new int[N];
        int M = Integer.parseInt(firstLine[1]);

        for(int i = 0; i < N; i++){
            basket[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            //iB와 jB: 바꿀 바구니 2개 선택. 1번이랑 3번 바구니 바꾸고싶음 [0] <-> [2]
            String[] input = br.readLine().split(" ");
            int iB = Integer.parseInt(input[0]);//1
            int jB = Integer.parseInt(input[1]);//3

            //바꾸는 과정
            int temp = basket[jB-1];//temp에 공 숫자 저장해둠. b[2] = 20일때 20을 저장
            basket[jB-1] = basket[iB-1];//b[2] = b[0]
            basket[iB-1] = temp;//b[0] = b[2]
        }
        for(int i = 0; i < basket.length; i++){
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}