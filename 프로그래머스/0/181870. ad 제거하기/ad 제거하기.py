def solution(strArr):
    answer = []
    for i in strArr:
        if "ad" in i:
            continue
        else:
            answer += [i]
    return answer