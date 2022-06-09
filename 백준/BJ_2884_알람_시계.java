package 백준;
// 알람 시계
// https://www.acmicpc.net/problem/2884

import java.util.Scanner;

public class BJ_2884_알람_시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (h == 0 && m < 45) {
            h = 23;
            m += 15;
        }else if(m < 45){
            h--;
            m += 15;
        }else{
            m -= 45;
        }

        System.out.println(h + " " + m);
        sc.close();
    }
}