def solution(rank, attendance):
    temp = []
    for i in range(len(rank)):
        if(attendance[i]):
            temp.append(rank[i])
    temp = sorted(temp)

    return 10000 * rank.index(temp[0]) + 100 * rank.index(temp[1]) + rank.index(temp[2])