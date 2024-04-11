def solution(arr, queries):
    answer = []
    num = -1
    for i in queries:
        temp = arr[i[0]:i[1]+1]
        temp.sort()
        for j in temp:
            if(j > i[2]):
                num = j;
                break
        answer.append(num)
        num = -1
    return answer