import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            switch (str) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (!stack.empty()) {
                        sb.append(stack.pop()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;

                case "size":
                    sb.append(stack.size()).append('\n');
                    break;

                case "empty":
                    if (!stack.empty()) {
                        sb.append(0).append('\n');
                    } else {
                        sb.append(1).append('\n');
                    }
                    break;

                case "top":
                    if (!stack.empty()) {
                        sb.append(stack.peek()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
            }
        }
        
        System.out.println(sb);
    }
}