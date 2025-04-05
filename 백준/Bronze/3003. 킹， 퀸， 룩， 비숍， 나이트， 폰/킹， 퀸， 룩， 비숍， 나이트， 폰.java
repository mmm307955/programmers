import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] chess = {1,1,2,2,2,8};
        int[] dhchess = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < chess.length; i++){
            dhchess[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < chess.length; i++){
            System.out.print(chess[i]-dhchess[i] + " ");
        }
        br.close();
    }
}