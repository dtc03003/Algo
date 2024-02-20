def solution(s):
    list = [ch for ch in s if s.count(ch) == 1]
    answer = "".join(sorted(list))
    return answer