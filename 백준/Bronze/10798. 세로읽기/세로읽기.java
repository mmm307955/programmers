import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15];
        int max = 0;
        
        for(int i = 0; i < ch.length; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                ch[i][j] = str.charAt(j);
            }
            if(max < ch[i].length) max = ch[i].length;
        }
        
        for(int i = 0; i < max; i++){
            for(int j = 0; j< 5; j++){
                if(ch[j][i] == '\0') continue;
                System.out.print(ch[j][i]);
            }
        }
        
    
    }
}