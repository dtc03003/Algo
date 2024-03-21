def solution(A, B):
    return 0 if A == B else (B+B).find(A) if A in B+B else -1