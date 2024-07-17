def solution(date1, date2):
    if(date1 == date2):
        return 0
    else:
        for i in range(3):
            if(date1[i] < date2[i]):
                return 1
            elif(date1[i] > date2[i]):
                return 0