def solution(numbers, direction):
    numbers.insert(0, numbers.pop()) if direction == "right" else numbers.append(numbers.pop(0))
    return numbers