import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[K];
        for(int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                for(int j = i - 1; j >= 0; j--){
                    if(arr[j] != 0){
                        arr[j] = 0;
                        break;
                    }
                }
            } else {
                arr[i] = input;
            }
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}