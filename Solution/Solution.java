package Solution;
// import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("최종 "+solution(3, 12));
    }
    
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = 0;
        }
        
        return answer;
    }
}
