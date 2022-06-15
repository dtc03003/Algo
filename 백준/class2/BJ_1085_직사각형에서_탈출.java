// 직사각형에서 탈출
// https://www.acmicpc.net/problem/1085

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ_1085_직사각형에서_탈출 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.set(2, list.get(2) - list.get(0));
        list.set(3, list.get(3) - list.get(1));

        Collections.sort(list);

        System.out.println(list.get(0));
    }
}