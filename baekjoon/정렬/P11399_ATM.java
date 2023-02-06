package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class P11399_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] S = new int[N+1];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for (int i = 1; i <= N; i++) {
            S[i] = A[i] + S[i - 1];
        }

        int result = 0;

        for (int i : S) {
            result += i;
        }

        System.out.println(result);
        sc.close();
    }
}
