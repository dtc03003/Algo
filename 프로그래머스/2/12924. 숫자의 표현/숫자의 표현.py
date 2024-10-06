def solution(n):
    answer = 1
    for i in range(1, (n+1)//2):
        sum = 0
        for j in range(i, n+1):
            sum += j
            print(sum)
            if sum == n:
                print("증가")
                answer += 1
                break;
            elif sum > n:
                break;
    return answer