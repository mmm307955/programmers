import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int C = Integer.parseInt(br.readLine());

            int QuarterCount = C/25;
            C %= 25;
            int DimeCount = C/10;
            C %= 10;
            int NickelCount = C/5;
            C %= 5;
            int PennyCount = C;

            System.out.println(QuarterCount + " " + DimeCount + " " + NickelCount + " " + PennyCount);
        }
    }
}