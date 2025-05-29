import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());//5
        
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());//4 1 5 2 3
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        st = new StringTokenizer(br.readLine());//5
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());//1 3 7 9 5
        for(int i = 0; i < M; i++){
            int target = Integer.parseInt(st.nextToken());
            int startIndex = 0;
            int endIndex = N-1;
            boolean found = false;
            
            while(startIndex <= endIndex){
                int midIndex = (startIndex + endIndex) / 2;
                int midValue = arr[midIndex];
                    if(midValue < target){
                        startIndex = midIndex + 1;
                    }else if(midValue > target){
                        endIndex = midIndex - 1;
                    }else{
                        found = true;
                        break;
                    }
            }
            
            if(found){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}