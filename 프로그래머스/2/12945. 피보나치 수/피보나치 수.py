def solution(n):
    num = 0;
    cur = 1;
    
    for i in range(2, n+1):
        cur, num = cur+num, cur
    
    return cur % 1234567