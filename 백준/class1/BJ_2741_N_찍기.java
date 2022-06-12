package 백준.class1;
// N 찍기
// https://www.acmicpc.net/problem/2741

import java.util.Scanner;

public class BJ_2741_N_찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}