package 백준.class1;
// 평균
// https://www.acmicpc.net/problem/1546

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1546_평균 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        int max = Integer.MIN_VALUE;
        float sum = 0, avg = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            sum += score[i];
            if (score[i] > max) max = score[i];
        }

        avg = (sum / max * 100) / N;

        System.out.println(avg);
    }
}