def solution(cipher, code):
    answer = ''
    cnt = 0;
    for ch in cipher:
        cnt += 1;
        if(cnt == code):
            cnt = 0;
            answer += ch;
    return answer