import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];//N개 입력받을 배열 선언

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int num = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num) count++;
        }

        br.close();
        bw.write(count+"");
        bw.flush();
        bw.close();


    }
}