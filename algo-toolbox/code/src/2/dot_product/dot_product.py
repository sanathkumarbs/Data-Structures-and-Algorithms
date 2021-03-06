#!/usr/bin/python -tt # Uses python3

import sys

#def min_dot_product(a, b):
    #write your code here
#    res = 0
#    for i in range(len(a)):
#        res += a[i] * b[i]
#    return res

def greedy_min_dot_product(a, b):

    sortedA = sorted(a)
    sortedB = sorted(b, reverse=True)

    res = 0

    for i in range(len(sortedA)):
        res += sortedA[i] * sortedB[i]
    return res


if __name__ == '__main__':
    input = sys.stdin.read()
    data = list(map(int, input.split()))
    n = data[0]
    a = data[1:(n + 1)]
    b = data[(n + 1):]
    print(greedy_min_dot_product(a, b))
    
