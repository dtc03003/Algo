import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_10845_큐 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int last = -1;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    q.offer(last);
                    break;
            
                case "pop":
                    if(q.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(q.poll()).append("\n");
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "empty":
                    sb.append(q.isEmpty()? 1: 0).append("\n");
                    break;

                case "front":
                    sb.append(q.isEmpty()? -1: q.peek()).append("\n");
                    break;

                case "back":
                    sb.append(q.isEmpty()? -1: last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}