import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(solve(sc.next()));
        }
    }
    public static String solve(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }else if(stack.empty()){
                return "NO";
            }else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}