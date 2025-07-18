import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException{
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if(input.equals("push")){
                int inputInt = Integer.parseInt(st.nextToken());
                queue.offer(inputInt);
            }

            if(input.equals("front")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.peek());
                }
            }

            if(input.equals("back")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(((LinkedList<Integer>) queue).getLast());
                }
            }

            if(input.equals("size")){
                System.out.println(queue.size());
            }

            if(input.equals("empty")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }

            if(input.equals("pop")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.poll());
                }
            }

        }


    }
}
