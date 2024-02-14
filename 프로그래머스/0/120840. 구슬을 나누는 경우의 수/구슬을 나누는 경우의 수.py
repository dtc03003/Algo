def solution(balls, share):
    answer = 1;
    for i in range(balls, balls-share, -1):
        answer = answer * i 
    
    for i in range(1, share+1):
        answer = answer // i
     
    return answer