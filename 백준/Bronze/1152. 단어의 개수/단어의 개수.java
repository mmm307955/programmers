import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.trim();
        if(input.equals("")){
            System.out.println(0);
        }else{
            String[] arr = input.split(" ");
            System.out.println(arr.length);
        }
    }
}