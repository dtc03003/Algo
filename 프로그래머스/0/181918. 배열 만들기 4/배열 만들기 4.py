def solution(arr):
    stk = []
    i = 0

    while(i < len(arr)):
        if len(stk) == 0:
            stk.append(arr[i])
            i += 1;
        if not len(stk) == 0:
            if stk[-1] < arr[i]:
                stk.append(arr[i])
                i += 1;
            else:
                del stk[-1]
    return stk