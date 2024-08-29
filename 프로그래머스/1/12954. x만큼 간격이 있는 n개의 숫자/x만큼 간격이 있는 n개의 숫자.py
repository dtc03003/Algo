def solution(x, n):
    answer = []
    # for i in range(x, x*n, x):
    #     answer.append(i)
    # answer.append(x*n)
    
    for i in range(n):
        answer.append((i+1)*x)
    return answer