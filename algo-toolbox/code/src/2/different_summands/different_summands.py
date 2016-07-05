#!/usr/bin/python -tt # Uses python3


import sys

def optimal_summands(n):
    summands = []
    num = 1
    rem = n

    while(rem>0):
    	if (rem-num>=num+1):
    		summands.append(num)
    		rem -= num
    		num += 1
    	elif(rem-num==0):
    		summands.append(num)
    		rem = 0    		   				
    	elif(num+1<=rem):
    		num += 1  		 		

    return summands

if __name__ == '__main__':
    input = sys.stdin.read()
    n = int(input)
    summands = optimal_summands(n)
    print(len(summands))
    #print summands
    for x in summands:
        print(x, end=' ')
