import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> plusQue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusQue = new PriorityQueue<>();

        int zero = 0;
        int one = 0;

        for (int i = 0; i < N; i++) {
            int data = sc.nextInt();
            if (data > 1) {
                plusQue.add(data);
            } else if (data == 1) {
                one++;
            } else if (data == 0) {
                zero++;
            } else {
                minusQue.add(data);
            }
        }

        int sum = 0;

        // 양수
        while (plusQue.size() > 1) {
            int first = plusQue.remove();
            int second = plusQue.remove();
            sum += first * second;
        }

        if (!plusQue.isEmpty()) {
            sum += plusQue.remove();
        }

        // 음수
        while (minusQue.size() > 1) {
            int first = minusQue.remove();
            int second = minusQue.remove();
            sum += first * second;
        }

        if (!minusQue.isEmpty()) {
            if (zero == 0) {
                sum += minusQue.remove();
            }
        }

        sum = sum + one;
        System.out.println(sum);
    }
}
