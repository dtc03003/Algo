def solution(s):
    count = 0
    num = 0
    while(1):
        if(s == "1"):
            return [num, count]
        num += 1
        count += s.count("0")
        s = s.replace("0", "")
        s = format(len(s), 'b')
