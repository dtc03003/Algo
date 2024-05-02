def solution(myStr):
    answer = []
    temp = ''
    for i in myStr:
        if i == 'a' or i == 'b' or i == 'c':
            if not(temp == ""):
                answer.append(temp)
                temp = ""
            continue;
        temp += i
        
    if temp:
        answer.append(temp)
        
    if not answer:
        answer.append("EMPTY")
    return answer