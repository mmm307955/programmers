import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            set.add(input);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if(set.contains(input)){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
