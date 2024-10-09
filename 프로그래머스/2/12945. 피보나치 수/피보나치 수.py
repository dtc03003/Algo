def solution(n):
    num = 0;
    current = 1;
    
    for i in range(2, n+1):
        current, num = current+num, current
    
    return current% 1234567