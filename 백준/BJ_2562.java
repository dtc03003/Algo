package 백준;
// 최대값
// https://www.acmicpc.net/problem/2562

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num , cnt = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 9; i++) {
            num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                cnt = i;
            }
        }

        System.out.printf(max+"\n"+cnt);
    }
}