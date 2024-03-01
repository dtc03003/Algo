def solution(s):
    answer = 0;
    temp = 0
    for i in s.split():
        if(i == "Z"):
            print(temp)
            answer -= temp
        else:
            answer += int(i)
            temp = int(i);
    return answer