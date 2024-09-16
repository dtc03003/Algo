def solution(s):
    s = s.lower()
    return " ".join([i.capitalize() for i in s.split(" ")])
