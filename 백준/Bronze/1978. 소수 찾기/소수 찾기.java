import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            numbers[i] =  Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < numbers.length; i++){
            boolean isPrime = true;
            if(numbers[i] == 1){
                isPrime = false;
            }else{
                for(int j = 2; j < numbers[i]; j++){
                    if(numbers[i] % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    count++;   
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}