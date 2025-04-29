import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while(n != -1){
            n = Integer.parseInt(br.readLine());
            if(n == -1) break;
            int[] arr = new int[n];
            boolean isPerfect = false;

            for(int i = 1; i < n; i++){
                if (n % i == 0) {
                    arr[i] = i;
                }
            }
            int numLast = -1;
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += arr[i];
                if(arr[i] != 0) numLast = i;
            }
            if(sum == n) isPerfect = true;
            if(isPerfect == true) {
                System.out.print(n + " = ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == numLast) {
                        System.out.println(arr[i]);
                    } else if (arr[i] != 0) {
                        System.out.print(arr[i] + " + ");
                    }
                }
            }else{
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}