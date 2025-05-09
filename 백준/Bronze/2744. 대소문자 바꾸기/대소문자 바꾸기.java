import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(c[i])){
                c[i] = Character.toUpperCase(c[i]);
            }else{
                c[i] = Character.toLowerCase(c[i]);
            }
        }
        for(char ch : c){
            System.out.print(ch);
        }
        br.close();
    }
}