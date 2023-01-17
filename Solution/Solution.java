package Solution;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("최종 "+solution(1234567));
    }
    
    public static String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        
        for(int i = 0; i < str.length(); i++){
            answer += (char)(str.charAt(i) + '0');
        }
        
        return answer;
    }
}
