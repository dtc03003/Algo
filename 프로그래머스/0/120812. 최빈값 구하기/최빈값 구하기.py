def solution(array):
    answer = 0
    max_value = 0
    max_key = 0;
    cnt = {}
    
    for num in array:
        if num in cnt:
            cnt[num] += 1;
        else:
            cnt[num] = 1;
    

    for key, value in cnt.items():
        if(value > max_value):
            max_value = value
            max_key = key
    
    for key, value in cnt.items():
        if((key != max_key and value == max_value) and len(array) != 1):
            answer = -1
            break;
        else:
            answer = max_key
    return answer