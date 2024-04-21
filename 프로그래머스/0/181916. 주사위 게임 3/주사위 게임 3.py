def solution(a, b, c, d):
    nums = [a, b, c, d];
    count = {}
    for i in nums:
        try: count[i] += 1
        except: count[i]=1
        
    if len(count) == 1:
        return a*1111
    elif len(count) == 2:
        if 3 in count.values():
            p = [k for k, v in count.items() if v == 3][0]
            q = [k for k, v in count.items() if v == 1][0]
            return (10 * p + q) ** 2
        else:
            p, q = count.keys()
            return (p + q) * abs(p - q)
    elif len(count) == 3:
        p = [k for k, v in count.items() if v == 2][0]
        q, r = [k for k in nums if k != p]
        return q * r
    else:
        return min(nums)
        