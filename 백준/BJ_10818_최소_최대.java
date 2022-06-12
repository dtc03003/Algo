package 백준;
// 최소, 최대
// https://www.acmicpc.net/problem/10818

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10818_최소_최대 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num > MAX) {
                MAX = num;
            } 
            if (num < MIN) {
                MIN = num;
            }
        }
        System.out.printf("%d %d", MIN, MAX);
    }
}