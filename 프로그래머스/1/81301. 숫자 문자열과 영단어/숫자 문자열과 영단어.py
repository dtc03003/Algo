def solution(s):
    answer = ""
    num = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    stack = []
    
    for i in s:
        if not i.isnumeric():
            stack.append(i)
            
            if "".join(stack) in num:
                answer += str(num.index("".join(stack)))
                stack.clear()
        else:
            answer += i
            
    return int(answer)