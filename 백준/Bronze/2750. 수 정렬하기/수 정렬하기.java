import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            if(i == 0){
                arr[0] = Integer.parseInt(br.readLine());
                continue;
            }
            arr[i] = Integer.parseInt(br.readLine());
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    continue;
                }
            }
        }
        for(int a : arr){
            System.out.println(a);
        }
    }
}