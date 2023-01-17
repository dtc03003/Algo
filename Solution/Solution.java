package Solution;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("최종 "+solution(1234567, 2));
    }
    
    public static int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);

        for (int i = 1; i <= str.length(); i++) {
            if (str.charAt(i - 1) - '0'== k) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
