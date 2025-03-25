import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] arr = S.split("");
        int i = sc.nextInt();
        System.out.println(arr[i-1]);
    }
}