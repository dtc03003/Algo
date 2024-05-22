def solution(arr):
    i = 0
    while True:
        temp = arr.copy()
        for j in range(len(arr)):
            if arr[j] >= 50:
                if arr[j] % 2 == 0:
                    arr[j] = arr[j] // 2
            else:
                if arr[j] % 2 != 0:
                    arr[j] = arr[j] * 2 + 1
                    
        if temp == arr:
            return i
        i += 1 

