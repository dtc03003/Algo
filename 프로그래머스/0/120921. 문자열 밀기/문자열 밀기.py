def solution(A, B):
    answer = 0 if A == B else (B+B).find(A) if B in A+A else -1
    return answer