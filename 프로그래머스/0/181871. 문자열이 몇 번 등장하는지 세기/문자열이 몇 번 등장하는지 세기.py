def solution(myString, pat):
    answer = 0
    for i in range(len(myString)):
        answer += 1 if (myString[i:i+len(pat)] == pat) else 0
    return answer