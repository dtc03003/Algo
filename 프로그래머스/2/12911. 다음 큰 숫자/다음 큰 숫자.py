def solution(n):
    num = format(n, "b")
    
    while(-1):
        n += 1
        if num.count("1") == format(n, "b").count("1"):
            break;
    return n