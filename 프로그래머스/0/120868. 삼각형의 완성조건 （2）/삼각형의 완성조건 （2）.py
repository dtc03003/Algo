def solution(sides):
    answer = 0
    sides = sorted(sides)
    for i in range(sides[1]-sides[0]+1, sides[0]+sides[1]):
        answer = answer + 1
    return answer