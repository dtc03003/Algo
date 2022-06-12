package 백준.class1;
// A-B
// https://www.acmicpc.net/problem/1001

import java.util.Scanner;

public class BJ_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int subtract = A - B;

        System.out.println(subtract);
        sc.close();
    }
}
