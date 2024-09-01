def solution(num):
    index = 0
    while(num != 1):
        if(index == 500):
            return -1
        else:
            index += 1
        
        num = num // 2 if(num % 2 == 0) else num * 3 + 1
    return index