def solution(ineq, eq, n, m):
    return int(n <= m if ineq == "<" else n >= m if(eq == "=") else n < m if ineq == "<" else n > m)