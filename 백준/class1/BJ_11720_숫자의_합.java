package 백준.class1;
// 숫자의 합
// https://www.acmicpc.net/problem/11720

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11720_숫자의_합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int sum = 0;

        for (int j = 0; j < N; j++) {
            sum += str.charAt(j) - '0';
        }
        
        System.out.println(sum);
    }
}