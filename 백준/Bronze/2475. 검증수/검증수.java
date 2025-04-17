import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++){
            sum += Math.pow(Integer.parseInt(st.nextToken()),2);
        }
        System.out.println(sum%10);
        br.close();
    }
}