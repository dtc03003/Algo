def solution(sides):
    num = sorted(sides)
    return  1 if num[0] + num[1] > num[2] else 2