def solution(arr):
    stk = []
    
    for i in range(len(arr)):
        if(not stk):
            stk.append(arr[i])
        elif(stk[-1] == arr[i]):
            stk.pop()
        else:
            stk.append(arr[i])
        i += 1
    return [-1] if not stk else stk