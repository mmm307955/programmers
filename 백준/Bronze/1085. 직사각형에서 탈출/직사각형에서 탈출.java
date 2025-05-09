import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //현재 한수가 있는 위치는 (x,y)
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        //직사각형의 왼쪽 꼭짓점은 (0,0)에 있고 오른쪽 위 꼭짓점은 (w,h)에 있다
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int widthLength = -1;
        int heightLength = -1;
        if(w-x < 0){
            widthLength = -(w-x);
            if(x < widthLength){
                widthLength = x;
            }
        }else{
            widthLength = (w-x);
            if(x < widthLength){
                widthLength = x;
            }
        }
        
        if(h-y < 0){
            heightLength = -(h-y);
            if(y < heightLength){
                heightLength = y;
            }
        }else{
            heightLength = (h-y);
            if(y < heightLength){
                heightLength = y;
            }
        }
        
        if(widthLength <= heightLength){
            System.out.println(widthLength);
        }else{
            System.out.println(heightLength);
        }
        br.close();
    }
}