import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[6];

        for (int i = 0; i < 6; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        A[0] = 1 - A[0];
        A[1] = 1 - A[1];
        A[2] = 2 - A[2];
        A[3] = 2 - A[3];
        A[4] = 2 - A[4];
        A[5] = 8 - A[5];
        
        for (int i : A) {
            System.out.print(i+" ");
        }
    }
}