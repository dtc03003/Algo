package 백준.class1;
// 구구단
// https://www.acmicpc.net/problem/2739

import java.util.Scanner;

public class BJ_2739_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", N, i, N * i);
        }
        sc.close();
    }
}