package Solution;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println("최종 "+solution("56x + 1"));
    }
    
    public static String solution(String polynomial) {
        String[] str = polynomial.split("");
        String answer = "";
        int xnum = 0;
        int num = 0;

        for (int i = 0; i < polynomial.length(); i++) {

            // x 계산
            if (str[i].equals("x")) {
                String temp = "";

                for (int j = i - 1; j >= 0; j--) {
                    if (str[j].equals(" "))
                        break;
                    temp += str[j];
                }

                if (!temp.isEmpty()) {
                    StringBuffer sb = new StringBuffer(temp);
                    temp = sb.reverse().toString();
                } else {
                    temp += "1";
                }

                xnum += Integer.parseInt(temp);
            }

            // 정수 개산
            if ((str[i].equals("+") && !str[i - 2].equals("x"))
                    || (i == polynomial.length() - 1 && !str[polynomial.length() - 1].equals("x"))) {
                String temp = "";
                if (!(i == polynomial.length() - 1)) {
                    for (int j = i - 2; j >= 0; j--) {
                        if (str[j].equals(" "))
                            break;
                        temp += str[j];
                    }
                } else {
                    for (int j = i; j >= 0; j--) {
                        if (str[j].equals(" "))
                            break;
                        temp += str[j];
                    }
                }

                StringBuffer sb = new StringBuffer(temp);
                temp = sb.reverse().toString();

                num += Integer.parseInt(temp);
            }
        }
        
        if (xnum == 0) {
            answer = num + "";
        } else {
            if (num == 0) {
                if (xnum == 1) {
                    answer = "x";
                } else {
                    answer = xnum + "x";
                }
            } else {
                if (xnum == 1) {
                    answer = "x + " + num;
                } else {
                    answer = xnum + "x + " + num;
                }
            }
        }
        
        return answer;
    }
}
