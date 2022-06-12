package 백준.class1;
// 시험 성적
// https://www.acmicpc.net/problem/9498

import java.util.Scanner;

public class BJ_9498_시험_성적 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 89) {
            System.out.println("A");
        } else if (num > 79) {
            System.out.println("B");
        } else if (num > 69) {
            System.out.println("C");
        } else if (num > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}