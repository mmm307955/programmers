import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[10][10];
        for(int i = 1; i <= 9; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <=9; j++){
              arr[i][j] = Integer.parseInt(st.nextToken());  
            }
        }
        int max = -1;
        int row = -1;
        int col = -1;
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <=9; j++){
              if(arr[i][j] > max) {
                  max = arr[i][j];
                  row = i;
                  col = j;
              }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}