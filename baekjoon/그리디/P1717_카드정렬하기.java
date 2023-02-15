package 그리디;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1717_카드정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            que.add(sc.nextInt());
        }

        int data1 = 0;
        int data2 = 0;
        int sum = 0;

        while (que.size() != 1) {
            data1 = que.remove();
            data2 = que.remove();
            sum += data1 + data2;
            que.add(data1 + data2);
        }

        System.out.println(sum);
    }
}
