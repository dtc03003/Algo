package 백준.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1244_스위치_켜고_끄기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int switchNum = Integer.parseInt(br.readLine()); // 스위치 개수
        int[] sw = new int[switchNum]; // 스위치 상태

        // 스위치 상태 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < switchNum; i++) {
            sw[i] = Integer.parseInt(st.nextToken());
        }

        // 학생 상태 입력
        int stNum = Integer.parseInt(br.readLine()); // 학생 수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < stNum; i++) {
            // int gender = Integer.parseInt(st.nextToken());   // 학생 성별
            // int stsw = Integer.parseInt(st.nextToken());     // 학생 스위치 개수
        }

        printSW(switchNum, sw);
    }

    private static void printSW(int switchNum, int[] sw) {
        for (int i = 0; i < switchNum; i++) {
            System.out.print(sw[i]);
        }
    }
}
