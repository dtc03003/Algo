package Solution;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("최종 "+solution("a"));
    }
    
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            if (s.length() == 1) {
                answer += str[i];
                break;
            }
            if ((i != str.length - 1 && !str[i].equals(str[i + 1])) || (i == str.length -1 && !str.equals(str[i-1]))) {
                if ((i != 0 && !str[i].equals(str[i - 1])) || i == 0) {
                    answer += str[i];
                }
            }
        }

        return answer;
    }
}
