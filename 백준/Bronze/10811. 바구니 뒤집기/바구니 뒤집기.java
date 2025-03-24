import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);//바구니 개수
        int[] basket = new int[N];
        int M = Integer.parseInt(firstLine[1]);

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int change = 0; change < M; change++) {
            String[] input = br.readLine().split(" ");
            int firstBasket = Integer.parseInt(input[0]);
            int endBasket = Integer.parseInt(input[1]);

            for (int i = 0; firstBasket -1 +i < (endBasket+firstBasket)/2; i++) {
                if(basket[firstBasket+i-1] == basket[endBasket - i -1]) break;
                int temp = basket[firstBasket - 1 + i];
                basket[firstBasket - 1 + i] = basket[endBasket - 1 - i];
                basket[endBasket - 1 - i] = temp;
            }

        }
            for (int i = 0; i < basket.length; i++) {
                bw.write(basket[i] + " ");
            }

            bw.flush();
            bw.close();
            br.close();
    }
}
