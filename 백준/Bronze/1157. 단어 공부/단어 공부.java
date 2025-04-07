import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "?";
        String str = br.readLine();
        char[] c = str.toUpperCase().toCharArray();
        
        int count = 0;
        int max = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : c){
            if(!map.containsKey(x)) count = 1;
            else{
                count = map.get(x) + 1;
            }
            map.put(x,count);
        }
        
        for(char x : map.keySet()){
            if(map.get(x) > max){
                max = map.get(x);
                answer = String.valueOf(x);
            }else if(map.get(x) == max){
                answer = "?";
        }
        
    }
        System.out.println(answer);
    }
}