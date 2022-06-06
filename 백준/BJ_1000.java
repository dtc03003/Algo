package 백준;
// A+B
// https://www.acmicpc.net/problem/1000

import java.util.Scanner;

public class BJ_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A + B;

        System.out.println(sum);
        sc.close();
    }
}
