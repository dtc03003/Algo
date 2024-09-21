def solution(s):
    answer = ''
    for i in s.split(" "):
        for j in range(len(i)):
            if j%2:
                answer += i[j].lower()
            else:
                answer += i[j].upper()
        answer += " "

    return answer[:-1]