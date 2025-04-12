import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        
        if(N == 1){
            System.out.println(1);
            System.exit(0);
        }
        
        int startNum = 0;
        int lastNum= 1;
        
        for(int i = 1; i < N; i++){
            startNum = lastNum + 1;
            lastNum = lastNum + 6 * i;
            if(startNum <= N && N <= lastNum) {
                answer = i+1;
                break;
            }
        }
        System.out.println(answer);
    }
}