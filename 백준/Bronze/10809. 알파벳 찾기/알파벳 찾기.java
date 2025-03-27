import java.io.*;

public class Main{
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(arr[c - 'a'] == -1){
                arr[c - 'a'] = i;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        br.close();
        
    }
}