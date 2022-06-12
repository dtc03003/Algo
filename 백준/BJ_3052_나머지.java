package 백준;
// 나머지
// https://www.acmicpc.net/problem/3052

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_3052_나머지 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        int cnt = 0;
        
        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        for (boolean i : arr) {
            if (i) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}