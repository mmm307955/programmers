import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long answer = 0;
        long[] sum = new long[N];
        long[] mod = new long[M];
        
        st = new StringTokenizer(br.readLine());
        sum[0] = Long.parseLong(st.nextToken()) % M;
        
        for(int i = 1; i < N; i++){
            sum[i] = (sum[i-1] + Long.parseLong(st.nextToken())) % M;
        }
        for(int i = 0; i < N; i++){
            if (sum[i] == 0) answer++;
            mod[(int)sum[i]]++;
        }
        for(int i = 0; i < M; i++){
            if(mod[i] > 1){
                answer += mod[i]*(mod[i]-1)/2;
            }
        }
        System.out.println(answer);
    }
}