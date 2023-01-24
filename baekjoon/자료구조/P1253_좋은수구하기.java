package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수구하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        long[] A = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            int start_index = 0;
            int end_index = N - 1;
            long find = A[i];
            
            while (start_index < end_index) {
                long sum = A[start_index] + A[end_index];
                if (sum == find) {
                    if (start_index != i && end_index != i) {
                        cnt++;
                        break;
                    } else if (start_index == i) {
                        start_index++;
                    } else if (end_index == i) {
                        end_index--;
                    }
                } else if (sum < find) {
                    start_index++;
                } else {
                    end_index--;
                }
            }
        }
        System.out.println(cnt);
    }
}
