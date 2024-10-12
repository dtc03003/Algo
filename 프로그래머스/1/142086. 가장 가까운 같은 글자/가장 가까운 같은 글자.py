def solution(s):
    answer = [-1]
    for i in range(len(s)):
        cnt = 0
        for j in range(i-1, -1, -1):         
            cnt += 1
            
            if s[i] == s[j]:
                answer.append(cnt)
                cnt = 0
                break;
            elif j == 0:
                answer.append(-1)
    return answer