def solution(numbers, direction):
    numbers.insert(0, numbers.pop(len(numbers)-1)) if direction == "right" else numbers.append(numbers.pop(0))
    return numbers