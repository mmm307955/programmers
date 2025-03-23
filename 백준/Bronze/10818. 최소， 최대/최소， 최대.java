import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(input[i]);
            if (num > max) max = num;
            if(num < min) min = num;
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();

    }
}