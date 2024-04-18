def solution(myString):
    answer = ''
    for i in myString:
        if 'a' <= i <= 'k':
            answer += 'l'
        else:
            answer += i
    return answer