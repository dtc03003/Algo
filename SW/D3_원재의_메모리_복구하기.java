package SW;

import java.util.Scanner;

public class D3_원재의_메모리_복구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= T; i++) {
            char[] memory = sc.nextLine().toCharArray();
            int cnt = memory[0] == '1' ? 1 : 0;

            for (int j = 0; j < memory.length - 1; j++) {
                if (memory[j] != memory[j + 1])
                    cnt++;
            }

            System.out.printf("#%d %d\n", i, cnt);
        }

        sc.close();
    }
}
