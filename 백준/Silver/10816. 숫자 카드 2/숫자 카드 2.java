import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            int input = Integer.parseInt(st.nextToken());
            map.put(input, map.getOrDefault(input,0)+1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < M; i++){
            int input = Integer.parseInt(st.nextToken());
            if(map.get(input) == null){
               sb.append(0).append(" ");
            }else{
               sb.append(map.get(input)).append(" ");
            }
        }
        System.out.println(sb.toString().strip());
    }
}
