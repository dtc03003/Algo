package Solution;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("최종 "+solution(1234567));
    }
    
    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int m = numbers[0] * numbers[1];
        int p = numbers[numbers.length - 2] * numbers[numbers.length - 1];

        if (m > p) {
            answer = m;
        } else {
            answer = p;
        }

        return answer;
    }
}
