import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            boolean[] check = new boolean[26];
            boolean isGroupWord = true;
            for(int j = 0; j < str.length(); j++){
            char current = str.charAt(j);
                if(check[current-'a']){
                    if(j > 0 && str.charAt(j-1) != current){
                        isGroupWord = false;
                        break;
                    }
                }else{
                    check[current -'a'] = true;
                }
            }
            if(isGroupWord){
                count++;
            }
        }
        System.out.println(count);
    }
}