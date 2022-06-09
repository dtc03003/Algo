package 백준;
// 검증수
// https://www.acmicpc.net/problem/2475

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0, sum = 0;

        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }

        System.out.println(sum%10);
    }
}