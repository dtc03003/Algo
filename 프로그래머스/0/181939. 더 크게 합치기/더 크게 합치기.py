def solution(a, b):
    return  int(str(b)+str(a)) if int(str(b)+str(a)) > int(str(a)+str(b)) else int(str(a)+str(b))