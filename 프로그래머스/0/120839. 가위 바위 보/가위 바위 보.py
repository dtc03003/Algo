def solution(rsp):
    answer = ''
    rspList = list(str(rsp))
    
    for s in rspList:
        if(s == "2"):
            answer += "0"
        if(s == "0"):
            answer += "5"
        if(s == "5"):
            answer += "2"
    return answer