import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(br.readLine());
        int secondNum = Integer.parseInt(br.readLine());
        int minPrime = 0;
        long sum = 0;
        for(int i = firstNum; i <= secondNum; i++){
            if(i == 1) continue;
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if( i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                if(minPrime == 0){
                    minPrime = i;
                }
                sum += i;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }
}