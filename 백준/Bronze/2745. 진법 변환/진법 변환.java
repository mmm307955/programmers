import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String B = st.nextToken();
        String N = st.nextToken();
        int result = 0;
        char[] c = B.toCharArray();
        int[] numberBox = new int[B.length()];

        for(int i = 0; i < B.length(); i++){
            if(c[i] == 'A'){
                numberBox[i] = 10;
            }else if(c[i] == 'B'){
                numberBox[i] = 11;
            }else if(c[i] == 'C'){
                numberBox[i] = 12;
            }else if(c[i] == 'D'){
                numberBox[i] = 13;
            }else if(c[i] == 'E'){
                numberBox[i] = 14;
            }else if(c[i] == 'F'){
                numberBox[i] = 15;
            }else if(c[i] == 'G'){
                numberBox[i] = 16;
            }else if(c[i] == 'H'){
                numberBox[i] = 17;
            }else if(c[i] == 'I'){
                numberBox[i] = 18;
            }else if(c[i] == 'J'){
                numberBox[i] = 19;
            }else if(c[i] == 'K'){
                numberBox[i] = 20;
            }else if(c[i] == 'L'){
                numberBox[i] = 21;
            }else if(c[i] == 'M'){
                numberBox[i] = 22;
            }else if(c[i] == 'N'){
                numberBox[i] = 23;
            }else if(c[i] == 'O'){
                numberBox[i] = 24;
            }else if(c[i] == 'P'){
                numberBox[i] = 25;
            }else if(c[i] == 'Q'){
                numberBox[i] = 26;
            }else if(c[i] == 'R'){
                numberBox[i] = 27;
            }else if(c[i] == 'S'){
                numberBox[i] = 28;
            }else if(c[i] == 'T'){
                numberBox[i] = 29;
            }else if(c[i] == 'U'){
                numberBox[i] = 30;
            }else if(c[i] == 'V'){
                numberBox[i] = 31;
            }else if(c[i] == 'W'){
                numberBox[i] = 32;
            }else if(c[i] == 'X'){
                numberBox[i] = 33;
            }else if(c[i] == 'Y'){
                numberBox[i] = 34;
            }else if(c[i] == 'Z'){
                numberBox[i] = 35;
            }else{
                numberBox[i] = c[i]-'0';
            }
        }

        for(int i = 0; i < numberBox.length; i++){
            result += (int)(Math.pow(Integer.parseInt(N), B.length()-1-i))*numberBox[i];
        }
        System.out.println(result);
    }
}