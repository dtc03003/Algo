def solution(a, b):
    isA = a % 2 == 0
    isB = b % 2 == 0
    
    if isA and isB:
        return abs(a-b)
    elif isA or isB:
        return 2*(a+b)
    else:
        return a**2+b**2
