package 백준;
// OX퀴즈
// https://www.acmicpc.net/problem/8958

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_8958_OX퀴즈 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int cnt = 0, score = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score++;
                    cnt += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(cnt);
        }
    }
}