import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prize = 0;

        if(a == b){
            if(b != c){
                prize = 1000 + (a * 100);
            }else{
                prize = 10000 + (a * 1000);
            }
        }else if(b == c){
            if(a != c){
                prize = 1000 + (b * 100);
            }else{
                prize = 10000 + (a * 1000);
            }
        }else if(a == c){
            if(a != b){
                prize = 1000 + (a * 100);
            }else{
                prize = 10000 + (a * 1000);
            }
        }else{
           int max = Math.max(a,b);
           max = Math.max(max,c);
           prize = max * 100;
        }

        System.out.println(prize);
    }
}