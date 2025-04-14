import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int mul = 1;
        int sideDot = 3;
        for(int i = 1; i < N; i++){
            mul *= 2;
            sideDot += mul;
        }
        System.out.println(sideDot*sideDot);
        br.close();
    }
}