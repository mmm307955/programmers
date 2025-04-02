import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //734 893 입력받는다.
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int AHundred = A/100;
        int Amid = (A%100)/10;
        int AOne = A%10;
        int changedA = AOne*100 + Amid*10 + AHundred;

        int BHundred = B/100;
        int Bmid = (B%100)/10;
        int BOne = B%10;
        int changedB = BOne*100 + Bmid*10 + BHundred;

        if (changedA > changedB){
            System.out.println(changedA);
        }else{
            System.out.println(changedB);
        }
    }
}