def solution(price, money, count):
    answer = sum([(i+1)*price for i in range(count)])-money 
    return 0 if answer <= 0 else answer