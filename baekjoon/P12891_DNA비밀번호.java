import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());   // DNA 문자열 길이
        int P = Integer.parseInt(st.nextToken());   // 비밀번호로 사용할 부분문자열의 길이
        int cnt = 0;
        
        char[] ch = new char[S];                    // 문자열 데이터
        checkArr = new int[4];                      // 비밀번호 체크 배열
        myArr = new int[4];                         // 현재 상태 배열
        checkSecret = 0;                            // 몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수
        
        ch = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0)
                checkSecret++;
        }
        
        
    }
}
