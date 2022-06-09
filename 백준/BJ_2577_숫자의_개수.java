package 백준;
// 숫자의 개수
// https://www.acmicpc.net/problem/2577

import java.util.Scanner;

public class BJ_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String st = Integer.toString(A * B * C);

        int[] num = new int[10];

        for (int i = 0; i < st.length(); i++) {
            num[st.charAt(i) - '0']++;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }

        sc.close();
    }
}
