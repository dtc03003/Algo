import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] num = new boolean[N];
        
        for (int i = 1; i <= N; i++) {
            String str = Integer.toString(i);
            int sum = 0;

            for (int j = 0; j < str.length(); j++) {
                sum += str.charAt(j) - '0';
            }

            sum += i;

            if (sum == N) {
                num[i] = true;
                break;
            }
        }

        for (int i = 0; i < N; i++) {
            if (num[i]) {
                sb.append(i);
                break;
            } else if (i == N - 1) {
                sb.append(0);
            }
        }
        
        System.out.println(sb);
    }
}