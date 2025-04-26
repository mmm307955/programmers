import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = 1;
        int B = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if(B > A && B % A == 0){
                System.out.println("factor");
            }else if(A > B && A % B == 0){
                System.out.println("multiple");
            }else if(A == 0 && B == 0){
                break;
            }else{
                System.out.println("neither");
            }
        }
        br.close();
    }
}
