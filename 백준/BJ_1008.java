package 백준;
// A/B
// https://www.acmicpc.net/problem/1008

import java.util.Scanner;

public class BJ_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        double division = A / B;

        System.out.println(division);
    }
}