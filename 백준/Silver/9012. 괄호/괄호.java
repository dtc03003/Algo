import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }
        
        System.out.println(sb);
    }

    private static String solve(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);

            if (c == '(') {
                stack.push(c);
            }

            else if (c == ')') {
                if (stack.empty() || c != ')') {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
