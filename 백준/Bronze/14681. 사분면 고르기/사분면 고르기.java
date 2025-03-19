import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if(x > 0){
            if(y > 0){
                System.out.println("1");
            }else{
                System.out.println("4");
            }
        }else if(x < 0){
            if(y > 0){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }else{
            System.out.println("잘못된 값입니다. 0은 입력할 수 없습니다.");
        }

    }
}