def solution(arr):
    answer = [[]]

    size = max(len(arr[1]), len(arr))
    
    answer = [[0] * size for i in range(size)]
    
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            answer[i][j] = arr[i][j]
    
    return answer