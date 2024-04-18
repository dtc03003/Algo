def solution(myString):
    answer = ''
    for i in myString:
        answer += 'l' if i < 'l' else i
    return answer