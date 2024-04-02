def solution(a, d, included):
    answer = 0
    for i in range(len(included)):
        answer += a+d*i if included[i] else 0
            
    return answer