def solution(s):
    numbers = [int(i) for i in s.split()]
    return f"{min(numbers)} {max(numbers)}"
