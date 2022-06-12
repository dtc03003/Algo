package 백준;
// 알파벳 찾기
// https://www.acmicpc.net/problem/10809

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10809_알파벳_찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[26];

        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (num[str.charAt(i) - 'a'] == -1) {
                num[str.charAt(i) - 'a'] = i;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.print(num[i] + " ");
        }
    }
}