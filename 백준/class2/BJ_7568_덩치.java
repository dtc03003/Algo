import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_7568_덩치 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int [N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 키
        }
        
        for (int i = 0; i < N; i++) {
            int num = 1;

            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    num++;
                }
            }
            System.out.print(num+" ");
        }
    }
}