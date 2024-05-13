def solution(n, k):
    return [i for i in range(n+1) if i % k == 0 and i != 0]