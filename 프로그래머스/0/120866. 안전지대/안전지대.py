def solution(board):
    answer = 0
    dx = [-1, -1, -1, 0, 0, 1, 1, 1]
    dy = [-1, 0, 1, -1, 1, -1, 0, 1]
    n = len(board)
    m = len(board[0])
    
    for i in range(0, len(board)):
        for j in range(0, len(board[0])):
            if board[i][j] == 1:
                for k in range(8):
                    nx = i + dx[k]
                    ny = j + dy[k]
                    if 0 <= nx < n and 0 <= ny < m and board[nx][ny] != 1:
                        board[nx][ny] = 2
                        
    for i in range(0, len(board)):
        for j in range(0, len(board[0])):
            if(board[i][j] == 0):
                answer = answer + 1



    return answer