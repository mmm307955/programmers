import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            arr[i] %= 42;
        }

        //arr[i]에서 같은 숫자가 나오는지 확인
        for(int i = 0; i < 10; i++){
            for(int j = i+1; j < 10; j++){
                if(arr[i] == arr[j]){
                    arr[j] = 42;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] != 42) count++;
        }

        System.out.println(count);

    }
}