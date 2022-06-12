import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < 3; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(list);

            int A = list.get(0);
            int B = list.get(1);
            int C = list.get(2);

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            if (A * A + B * B == C * C) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}