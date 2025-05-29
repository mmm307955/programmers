import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int haveEA = Integer.parseInt(st.nextToken());
        int needEA = Integer.parseInt(st.nextToken());

        long[] ysLan = new long[haveEA];
        long maxLen = 0;

        for (int i = 0; i < haveEA; i++) {
            ysLan[i] = Long.parseLong(br.readLine());
            if (ysLan[i] > maxLen) {
                maxLen = ysLan[i];
            }
        }

        long left = 1;
        long right = maxLen;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;

            for (long length : ysLan) {
                count += length / mid;
            }

            if (count >= needEA) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}