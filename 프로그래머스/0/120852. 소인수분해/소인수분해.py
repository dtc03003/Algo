def solution(n):
    answer = []
    cnt = 2;
    while cnt <= n:
        if n % cnt == 0:
            answer += [cnt]
            n = n / cnt
        else:
            cnt = cnt + 1
    answer = list(set(answer))
    answer.sort()
    return answer