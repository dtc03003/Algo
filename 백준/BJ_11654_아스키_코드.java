package 백준;
// 아스키 코드
// https://www.acmicpc.net/problem/11654

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11654_아스키_코드 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((int)br.readLine().charAt(0));
    }
}