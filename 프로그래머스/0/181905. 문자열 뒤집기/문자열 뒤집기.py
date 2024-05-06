def solution(my_string, s, e):
    
    return my_string[:s]+(my_string[::-1][-e-1:] if s == 0 else my_string[::-1][-e-1:-s])+my_string[e+1:]