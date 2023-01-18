package Solution;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("최종 "+solution("hello", "hello"));
    }
    
    public static int solution(String before, String after) {
        int answer = 1;
        String[] be = before.split("");
        String[] af = after.split("");

        Arrays.sort(be);
        Arrays.sort(af);

        for (int i = 0; i < af.length; i++) {
            if (!be[i].equals(af[i]))
                answer = 0;
        }

        return answer;
    }
}
