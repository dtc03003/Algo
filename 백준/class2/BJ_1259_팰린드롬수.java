import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1259_팰린드롬수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String str = br.readLine();
            int num = Integer.parseInt(str);
            boolean result = true;

            if (num == 0) {
                break;
            }

            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    result = false;
                }
            }

            // 출력
            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}