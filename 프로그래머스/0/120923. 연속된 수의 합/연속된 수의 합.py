def solution(num, total):
    answer = []
    start = total//num - num//2 + 1 if(num % 2 == 0) else total//num - num//2
    end = start + num
    for i in range(start, end):
        answer.append(i)
    return answer