// 분해합
// https://www.acmicpc.net/problem/2231

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2231_분해합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int str_len = str.length();

        int N = Integer.parseInt(str);
        int result = 0;
        
        for (int i = (N-(9*str_len)); i < N; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }
}