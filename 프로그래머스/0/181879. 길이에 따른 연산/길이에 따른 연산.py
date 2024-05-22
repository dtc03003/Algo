def solution(num_list):
    answer = 0
    if len(num_list) >= 11:
        return sum(num_list)
    else:
        num = 1
        for i in num_list:
            num *= i
        return num