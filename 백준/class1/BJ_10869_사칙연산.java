package 백준.class1;
// 사칙연산
// https://www.acmicpc.net/problem/10869

import java.util.Scanner;

public class BJ_10869_사칙연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A % B);
        
        sc.close();
    }
}