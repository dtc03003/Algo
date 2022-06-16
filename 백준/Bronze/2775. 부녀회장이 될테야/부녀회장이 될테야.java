import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] num = new int[k+1][n+1]; 
            
            for (int j = 0; j <= k; j++) {
                int sum = 0;

                for (int j2 = 1; j2 <= n; j2++) {
                    if (j != 0) {
                        sum += num[j - 1][j2];
                        num[j][j2] = sum;
                    } else {
                        num[0][j2] = j2;
                    }
                }
            }
            
            System.out.println(num[k][n]);
        }
    }
}