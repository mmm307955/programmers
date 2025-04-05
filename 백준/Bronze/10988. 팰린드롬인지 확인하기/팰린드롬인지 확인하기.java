import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] c = str.toCharArray();
        int count = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] == c[c.length-1-i]){
                count++;
            }
        }
        if(count == c.length) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}