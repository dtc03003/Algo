package Solution;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("최종 "+solution(3));
    }
    
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            int num = 1;

            for (int j = 1; j <= i; j++) {
                num *= j;
            }

            if (num > n)
                break;

            answer = i;
        }

        return answer;
    }
}
