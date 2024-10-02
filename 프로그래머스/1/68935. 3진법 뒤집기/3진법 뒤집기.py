def solution(n):
    answer = 0
    num = ""
    while(-1):
        num += str(n % 3)  
        if n < 3:
            break;
        else:
            n = n // 3
            
    for i in range(len(num)):
        answer += 3**(len(num) - i - 1) * int(num[i])
    return answer