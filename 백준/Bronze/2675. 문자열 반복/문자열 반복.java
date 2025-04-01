import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //테스트 케이스 개수를 입력받는다.
        int T = sc.nextInt();
        // String 배열을 만든다.
        String[] strs = new String[T];
        int[] nums = new int[T];

        //각 배열에 반복할 숫자와 문자열을 입력받는다.
        for(int i = 0; i < T; i++){
            nums[i] = sc.nextInt();
            strs[i] = sc.next();
        }

        //첫 번째 for문: 테스트 케이스의 개수만큼 반복
        //두 번째 for문: 문자열배열 내 문자열의 개수만큼 반복
        //세 번째 for문: nums배열의 숫자만큼 반복
        for(int i = 0; i < T; i++){
            for(int j = 0; j < strs[i].length(); j++){
                for(int k = 0; k < nums[i]; k++){
                    System.out.print(strs[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}