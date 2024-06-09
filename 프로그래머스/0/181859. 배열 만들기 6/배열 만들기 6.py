def solution(arr):
    stk = []
    for i in range(len(arr)):
        if(stk and stk[-1] == arr[i]):
            stk.pop()
        else:
            stk.append(arr[i])
        i += 1
    return stk or [-1] 