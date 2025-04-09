import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int[][] paper = new int[100][100];
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    paper[y+j][x+k] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < paper.length; i++){
            for(int j = 0; j < paper[i].length; j++){
                if(paper[i][j] == 1) count++;
            }
        }
        System.out.println(count);
    
    }
}