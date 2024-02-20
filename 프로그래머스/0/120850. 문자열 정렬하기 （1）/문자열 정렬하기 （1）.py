import re

def solution(my_string):
    answer = list(map(int, re.sub(r"[^0-9]", "", my_string)))
    answer.sort()
    return answer