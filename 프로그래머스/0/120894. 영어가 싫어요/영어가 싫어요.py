def solution(numbers):
    num = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    cnt = 0
    for i in num:
        numbers = numbers.replace(i, str(cnt))
        cnt += 1
    return int(numbers)