def solution(score):
    answer = []
    avg = [sum(i)/2 for i in score]
    avg_re = sorted(avg, reverse=True)

    for i in avg:
        answer.append(avg_re.index(i)+1)
    return answer 