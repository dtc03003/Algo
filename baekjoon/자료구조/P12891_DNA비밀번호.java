package 자료구조;
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
            if (checkArr[i] == 0) // 부분문자열의 개수가 0개인 문자가 있다면 checkSecret 1증가
                checkSecret++;
        }

        for (int i = 0; i < P; i++) {
            Add(ch[i]);
        }

        if(checkSecret == 4) cnt++;
        
        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(ch[i]);
            Remove(ch[j]);
            if (checkSecret == 4)
                cnt++;
        }
        System.out.println(cnt);
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(checkArr[0] == myArr[0])
                    checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (checkArr[1] == myArr[1])
                    checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (checkArr[2] == myArr[2])
                    checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (checkArr[3] == myArr[3])
                    checkSecret++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (checkArr[0] == myArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (checkArr[1] == myArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (checkArr[2] == myArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (checkArr[3] == myArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }
    }
}
