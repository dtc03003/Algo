def solution(n):
    return sum([i**2 for i in range(2, n+2, 2)]) if n % 2 == 0 else sum(range(1, n+2, 2))