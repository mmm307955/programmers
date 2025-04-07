import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] temperture = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            temperture[i] = Integer.parseInt(st.nextToken());
        }
        int[] sum = new int[N+1];
        for(int i = 1; i <= N; i++){
            sum[i] += sum[i-1] + temperture[i];
        }

        int[] tempDiff = new int[N - K + 1];

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < tempDiff.length; i++){
            tempDiff[i] = sum[K+i] - sum[i];
            if(tempDiff[i] > max) max = tempDiff[i];
        }
        System.out.println(max);
    }
}