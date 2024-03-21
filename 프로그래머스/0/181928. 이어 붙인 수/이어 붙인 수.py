def solution(num_list):
    answer = 0
    odd = "";
    ever = "";
    for i in num_list:
        if i % 2 == 0:
            ever += str(i)
        else:
            odd += str(i)
    return int(odd)+int(ever)