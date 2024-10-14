def solution(array, commands):
    answer = []
    for i in commands:
        answer.append(sorted([array[j] for j in range(i[0]-1, i[1])]).pop(i[2]-1))
    return answer