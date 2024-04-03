def solution(num_list):
    num = 1
    for i in num_list:
        num = num*i 
    return 0 if num > sum(num_list)**2 else 1