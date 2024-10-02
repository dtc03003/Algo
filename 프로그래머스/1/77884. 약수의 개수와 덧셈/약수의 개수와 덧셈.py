def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        cnt = 0
        for j in range(1, int(i**(1/2))+1):  
            cnt += 2 - (1 if j**2 == i else 0) if i % j == 0 else 0
        answer += i if cnt % 2 == 0 else -i     
    return answer