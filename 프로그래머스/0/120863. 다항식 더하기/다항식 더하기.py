def solution(polynomial):
    answer = ''
    num = 0;
    numX = 0;
    for i in polynomial.split(" + "):
        if 'x' in i:            
            numX += 1 if i == 'x' else int(i.replace("x", ""))
        else:
            num = num + int(i)
    
    
    if(numX != 0):
        answer = "x" if(numX == 1) else str(numX) + "x"
    if(num != 0):
        answer += (" + " if(numX != 0) else "") + str(num)
    return answer