def solution(n_str):  
    if(n_str[0] == "0"):
        for i in range(len(n_str)):
            if n_str[i] != "0":
                break;
        return n_str[i:]
    else:
        return n_str