def solution(arr):
    firstIndex = -1;
    lastIndex = -1;
    
    for i in range(len(arr)):
        if arr[i] == 2:
            if firstIndex == -1:
                firstIndex = i;
            else:
                lastIndex = i;
    
    if firstIndex == -1 and lastIndex == -1:
        return [-1]
    elif lastIndex == -1:
        return [2]
    else:
        return arr[firstIndex:lastIndex+1]