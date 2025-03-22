import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄 입력 → "10 5" 같은 거
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int X = Integer.parseInt(firstLine[1]);

        // 둘째 줄 입력 → "1 10 4 9 ..." 같은 숫자들
        String[] secondLine = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(secondLine[i]);
            if (num < X) {
                bw.write(num + " ");
            }
        }

        // 출력 마무리
        bw.flush();
        bw.close();
        br.close();

    }
}