def solution(n):
    answer = 0
    for i in range(n):
        if(i == 0):
            continue
        if(n % i == 1):
            return i