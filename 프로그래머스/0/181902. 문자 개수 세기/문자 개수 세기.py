def solution(my_string):
    answer = [0] * 58
    for i in my_string:
        answer[ord(i)-65] += 1
    return answer[:26]+answer[32:]