// ACM 호텔
// https://www.acmicpc.net/problem/10250

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10250_ACM_호텔 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());   // 방
            int W = Integer.parseInt(st.nextToken());   // 층
            int N = Integer.parseInt(st.nextToken());   // n번째 손님

            if (N % H == 0 ) {
                System.out.printf("%d\n", (H*100)+(N/H));
            } else {
                System.out.printf("%d\n", (N%H)*100 + (N/H)+1);
            }
        }
    }
}