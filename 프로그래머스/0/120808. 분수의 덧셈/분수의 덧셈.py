import math

def solution(numer1, denom1, numer2, denom2):
    answer = []
    sumNum = (numer1 * denom2) + (numer2 * denom1);
    sumDen = denom1 * denom2;
    gcd = math.gcd(sumNum, sumDen)
    return [sumNum//gcd, sumDen//gcd]