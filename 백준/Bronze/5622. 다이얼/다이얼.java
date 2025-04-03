import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char[] c = str.toCharArray();

        int count = 0;

        for(int i = 0; i < c.length; i++){
            if (c[i] == 1){
                count += 2;
            }else if (c[i] == 2 | c[i] == 'A' | c[i] == 'B' | c[i] == 'C'){
                count += 3;
            }else if (c[i] == 3 | c[i] == 'D' | c[i] == 'E' | c[i] == 'F'){
                count += 4;
            }else if (c[i] == 4 | c[i] == 'G' | c[i] == 'H' | c[i] == 'I'){
                count += 5;
            }else if (c[i] == 5 | c[i] == 'J' | c[i] == 'K' | c[i] == 'L'){
                count += 6;
            }else if (c[i] == 6 | c[i] == 'M' | c[i] == 'N' | c[i] == 'O'){
                count += 7;
            }else if (c[i] == 7 | c[i] == 'P' | c[i] == 'Q' | c[i] == 'R' | c[i] == 'S'){
                count += 8;
            }else if (c[i] == 8 | c[i] == 'T' | c[i] == 'U' | c[i] == 'V'){
                count += 9;
            }else if (c[i] == 9 | c[i] == 'W' | c[i] == 'X' | c[i] == 'Y' | c[i] == 'Z'){
                count += 10;
            }else if (c[i] == 0){
                count += 11;
            }
        }
        System.out.println(count);
        br.close();
    }
}