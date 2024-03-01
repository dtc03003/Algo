def solution(sizes):
    maxWidth = 0;
    maxHeight = 0;
    for i in sizes:
        i = sorted(i)
        if(i[0] > maxWidth):
            maxWidth = i[0]
        if(i[1] > maxHeight):
            maxHeight = i[1]
        
    return maxWidth*maxHeight