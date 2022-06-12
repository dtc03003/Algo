package 백준.class1;
// 윤년
// https://www.acmicpc.net/problem/2753

import java.util.Scanner;

public class BJ_2753_윤년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 4 == 0 && (N % 100 != 0 || N % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}