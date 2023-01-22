package 다시풀어보기;
import java.util.Scanner;

public class P2018_연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 1;
        int sum = 1;
        int start_index = 1;
        int end_index = 1;

        while (N != end_index) {
            if (N == sum) {
                cnt++;
                sum += ++end_index;
            } else if (N < sum) {
                sum -= start_index++;
            } else {
                sum += ++end_index;
            }
        }

        System.out.println(cnt);
    }
}
