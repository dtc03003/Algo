def solution(keyinput, board):
    answer = [0, 0]
    maxX, maxY = board[0]//2, board[1]//2
    for i in keyinput:   
        if i == "up" and answer[1] < maxY:
            answer[1] = answer[1] + 1
        elif i == "down" and answer[1] > -maxY:
            answer[1] = answer[1] - 1
        elif(i == "left" and answer[0] > -maxX):
            answer[0] = answer[0] - 1
        elif(i == "right" and answer[0] < maxX):
            answer[0] = answer[0] + 1
    return answer