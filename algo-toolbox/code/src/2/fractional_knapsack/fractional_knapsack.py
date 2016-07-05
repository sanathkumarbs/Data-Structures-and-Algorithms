#!/usr/bin/python -tt # Uses python3
import sys

def get_optimal_value(capacity, weights, values):
    pervalueList = []
    value = 0.

    for item in range(0,len(weights)):
    	pervalueList.append(values[item]/weights[item])

    merged = zip(pervalueList,weights,values)
    merged = sorted(merged, key= lambda item: item[0], reverse=True)

    item = 0

    while(capacity>0 and item<len(weights)):
    	iselected = merged[item]

    	if(iselected[1]<=capacity):
    		capacity -= iselected[1]
    		value += iselected[2]
    		item += 1
    	else:
    		value += capacity*iselected[0]
    		capacity=0

    return value


if __name__ == "__main__":
    data = list(map(int, sys.stdin.read().split()))
    n, capacity = data[0:2]
    values = data[2:(2 * n + 2):2]
    weights = data[3:(2 * n + 2):2]
    opt_value = get_optimal_value(capacity, weights, values)
    print("{:.10f}".format(opt_value))
