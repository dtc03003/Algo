import numpy as np

def solution(lines):
    answer = 0
    array = np.full(200, 0)

    for i in lines:
        for j in range(i[0], i[1]):
            array[100+j] = 2 if(array[100+j] == 1 or array[100+j] == 2) else 1
    return np.count_nonzero(array == 2)