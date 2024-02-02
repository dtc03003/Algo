def solution(age):
    answer = ''
    for num in str(age):
        answer += chr(int(num)+97)
    return answer