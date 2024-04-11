def solution(n, control):
    answer = n
    for i in control:
        if i == "w":
            answer = answer + 1
        elif i == "s":
            answer = answer - 1
        elif i == "d":
            answer = answer + 10
        elif i == "a":
            answer = answer - 10
    return answer