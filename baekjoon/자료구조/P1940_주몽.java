package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 재료의 개수
        int M = Integer.parseInt(br.readLine());    // 갑옷을 만드는데 필요한 수
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {               // N개의 재료들
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int cnt = 0;
        int start_index = 0;
        int end_index = N - 1;

        while (start_index < end_index) {
            int sum = A[start_index] + A[end_index];
            if (sum < M) {
                start_index++;
            } else if (sum > M) {
                end_index--;
            } else {
                cnt++;
                start_index++;
                end_index--;
            }
        }

        System.out.println(cnt);
    }
}
