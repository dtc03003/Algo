def solution(picture, k):
    return [''.join([char * k for char in i]) for i in picture for j in range(k)]