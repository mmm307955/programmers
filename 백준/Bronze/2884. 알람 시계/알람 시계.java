import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H, M;
        H = sc.nextInt();
        M = sc.nextInt();

        if(M-45 < 0){
            --H;
            if(H >= 0){
                M += 15; //60 - (45 - M)
            System.out.println(H + " "+ M);
            }else{
                H += 24;
                M += 15; 
                System.out.println(H + " "+ M);
            }
        }else{
            M -= 45;
            System.out.println(H + " "+ M);
        }

    }
}