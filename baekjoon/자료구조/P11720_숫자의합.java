package 자료구조;
import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        char[] cNum = sc.next().toCharArray();
        int sum = 0;

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }

        System.out.print(sum);
        sc.close();
    }
}
