def solution(num_list, n):
    answer = []
    temp = []
    for i in num_list:    
        temp.append(i)
        if n == len(temp):
            answer.append(temp)
            temp =[]
        
    return answer