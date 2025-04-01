import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //N M 입력받음
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] S = new long[N + 1];
        //입력받음과 동시에 누적합 저장
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(S[end] - S[start-1]);
        }
    }
}