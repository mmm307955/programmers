import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i = 0; i < 9; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > max) {
                max = num;
                index = i;
            }
        }
        bw.write(max + "\n" + (index+1) );
        bw.flush();
        bw.close();
        br.close();
    }
}