import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());

        for (int i = startNum; i <= endNum; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number){
        if(number < 2) return false;
        for(int i = 2; i * i <= number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
