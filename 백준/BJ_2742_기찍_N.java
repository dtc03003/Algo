package 백준;
// 기찍 N
// https://www.acmicpc.net/problem/2742

import java.util.Scanner;

public class BJ_2742_기찍_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i > 0; i--) {
            System.out.println(i);
        }
    }
}
