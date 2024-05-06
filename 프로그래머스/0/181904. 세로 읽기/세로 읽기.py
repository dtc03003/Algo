def solution(my_string, m, c):
    answer = ""
    for i in range(len(my_string)):
        if m == 1:
            return my_string;
        elif m == c:
            return my_string[c-1:]
        else:
            if (i+1)%m == c:
                answer += my_string[i]
    return answer