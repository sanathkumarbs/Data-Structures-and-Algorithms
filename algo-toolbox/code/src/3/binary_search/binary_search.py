#!/usr/bin/python -tt # Uses python3

import sys

def binary_search(a, x, low, high):

 #   print 'New Search : ', a, x, low, high

    if(low>high):
        return -1
    
    mid = low + (high-low)//2

    if(a[mid]==x):
 #       print 'Found!!'
        return mid
    else:
        if(a[mid]<x):
            low = mid + 1
#            print 'Less: ', low, high, mid, a[low:high]
            return binary_search(a, x, low, high)
        else:
            high = mid - 1
#            print 'Greater: ', low, high, mid, a[low:high]
            return binary_search(a, x, low, high)

def linear_search(a, x):
    for i in range(len(a)):
        if a[i] == x:
            return i
    return -1

if __name__ == '__main__':
    input = sys.stdin.read()
    data = list(map(int, input.split()))
    n = data[0]
    m = data[n + 1]
    a = data[1 : n + 1]
    for x in data[n + 2:]:
        # replace with the call to binary_search when implemented
        #print(binary_search(a, x), end = ' ')
        print(binary_search(a, x, 0, len(a)-1))
