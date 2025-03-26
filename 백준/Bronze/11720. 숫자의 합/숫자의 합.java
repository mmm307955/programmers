import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int sum = 0;
        String[] nums = sc.nextLine().split("");
        int[] numbers = new int[N];
        for(int i = 0; i < N; i++ ){
            numbers[i] = Integer.parseInt(nums[i]);
        }
        for(int i = 0; i < N; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}