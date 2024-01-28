def solution(my_string, n):
    answer = ''
    for s in my_string:
        for c in range(n):
            answer += s
    return answer