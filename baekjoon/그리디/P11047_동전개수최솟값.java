package 그리디;

import java.util.Scanner;

public class P11047_동전개수최솟값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = N-1; i >= 0; i--) {
            if (A[i] <= K) {
                cnt += (K / A[i]);
                K = K % A[i];
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
