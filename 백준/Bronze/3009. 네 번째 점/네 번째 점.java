import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        int answerx = 0;
        int answery = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int firstPointX = Integer.parseInt(st.nextToken());
        int firstPointY = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int secondPointX = Integer.parseInt(st.nextToken());
        int secondPointY = Integer.parseInt(st.nextToken());       
        
        st = new StringTokenizer(br.readLine());
        int thirdPointX = Integer.parseInt(st.nextToken());
        int thirdPointY = Integer.parseInt(st.nextToken());
        
        if(firstPointX != secondPointX){
            if(secondPointX == thirdPointX){
                answerx = firstPointX;
            }else{
                answerx = secondPointX;
            }
        }else{
            answerx = thirdPointX;
        }
        
        if(firstPointY != secondPointY){
            if(secondPointY == thirdPointY){
                answery = firstPointY;
            }else{
                answery = secondPointY;
            }
        }else{
            answery = thirdPointY;
        }
        System.out.println(answerx + " " + answery);
    }
}