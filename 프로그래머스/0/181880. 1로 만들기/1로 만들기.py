def solution(num_list):
    answer = 0
    for i in num_list:
        while True:
            if i == 1:
                break;
            i = i // 2;
            answer += 1;

    return answer