def solution(id_pw, db):
    answer = ''
    for str in db:
        if(id_pw == str):
            answer = "login"
            return answer
        if(id_pw[0] == str[0] and id_pw[1] != str[1]):
            answer = "wrong pw"
            return answer
        answer = "fail"

    return answer