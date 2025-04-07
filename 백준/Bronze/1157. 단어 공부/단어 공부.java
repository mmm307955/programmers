import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //일단 String으로 문장을 받고, 받은 걸 대문자로 바꾼다. 
        //그리고 각 문자의 개수를 세기 위해 char[]로 바꾼다. 
        String str = br.readLine();
        char[] ch = str.toUpperCase().toCharArray();
        String answer = "?";
        
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        
        //각 배열을 순회하며 알파벳 개수를 센다. 
        for(char x : ch){
            if(!map.containsKey(x)){
                count = 1;
            }else{
                count = map.get(x) + 1;
            }
            map.put(x,count);
        }
        
        int max = 0;
        for(char x : map.keySet()){
            if(map.get(x) > max) {
                max = map.get(x);
                answer = String.valueOf(x);
            }
            else if(map.get(x) == max) answer = "?";
        }
        System.out.print(answer);
    }
}