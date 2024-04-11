def solution(l, r):
    answer = []
    for i in range(l, r + 1):
        if all(j in '05' for j in str(i)):
            answer.append(i)
    return answer if answer else [-1]