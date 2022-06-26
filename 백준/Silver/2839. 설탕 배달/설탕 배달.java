import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N == 4 || N == 7) {
            sb.append(-1);
        } else if (N % 5 == 0) {
            sb.append(N / 5);
        } else if (N % 5 == 1 || N % 5 == 3) {
            sb.append((N / 5) + 1);
        } else if (N % 5 == 2 || N % 5 == 4) {
            sb.append((N / 5) + 2);
        }

        System.out.println(sb);
    }
}