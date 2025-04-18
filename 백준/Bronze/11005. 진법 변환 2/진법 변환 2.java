import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//N숫자
        int B = Integer.parseInt(st.nextToken());//B진법
        int count = 0;
        int realN = N;
        int lastDiv = 0;

        for(int i = 0; N > 0; i++){
            int mod = N % B;
            N /= B;
            if(N > 0){
                lastDiv = N;
            }else{
                lastDiv = mod;
                count++;
                break;
            }
            count++;
        }
        int[] number = new int[count];
        for(int i = count-1; i >= 0; i--){
            number[i] = realN % B;
            realN /= B;
        }
        number[0] = lastDiv;
        char[] charBox = new char[count];

        for(int i = 0; i < count; i++){
            if(number[i] == 10){
                charBox[i] = 'A';
            }else if(number[i] == 11){
                charBox[i] = 'B';
            }else if(number[i] == 12){
                charBox[i] = 'C';
            }else if(number[i] == 13){
                charBox[i] = 'D';
            }else if(number[i] == 14){
                charBox[i] = 'E';
            }else if(number[i] == 15){
                charBox[i] = 'F';
            }else if(number[i] == 16){
                charBox[i] = 'G';
            }else if(number[i] == 17){
                charBox[i] = 'H';
            }else if(number[i] == 18){
                charBox[i] = 'I';
            }else if(number[i] == 19){
                charBox[i] = 'J';
            }else if(number[i] == 20){
                charBox[i] = 'K';
            }else if(number[i] == 21){
                charBox[i] = 'L';
            }else if(number[i] == 22){
                charBox[i] = 'M';
            }else if(number[i] == 23){
                charBox[i] = 'N';
            }else if(number[i] == 24){
                charBox[i] = 'O';
            }else if(number[i] == 25){
                charBox[i] = 'P';
            }else if(number[i] == 26){
                charBox[i] = 'Q';
            }else if(number[i] == 27){
                charBox[i] = 'R';
            }else if(number[i] == 28){
                charBox[i] = 'S';
            }else if(number[i] == 29){
                charBox[i] = 'T';
            }else if(number[i] == 30){
                charBox[i] = 'U';
            }else if(number[i] == 31){
                charBox[i] = 'V';
            }else if(number[i] == 32){
                charBox[i] = 'W';
            }else if(number[i] == 33){
                charBox[i] = 'X';
            }else if(number[i] == 34){
                charBox[i] = 'Y';
            }else if(number[i] == 35){
                charBox[i] = 'Z';
            }else{
                charBox[i] = String.valueOf(number[i]).charAt(0);
            }
        }
        for(char c : charBox){
            System.out.print(c);
        }
    }
}