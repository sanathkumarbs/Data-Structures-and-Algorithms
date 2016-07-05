#!/usr/bin/python -tt # Uses python3
import sys

def get_fibonaccihuge1(n, m):
    res=[]
    res = get_fibonaccihuge(n, m)

    i = len(res)-2
    index = n%i	
    return res[index]

def get_fibonaccihuge(n, m):
    l = [0,1]
    i = 2

    l.append((l[i-1]+l[i-2])%m)
    i+=1

    while True:
    	if(l[i-2]==0)and(l[i-1]==1):
    		return l
    	else:
    		l.append((l[i-1]+l[i-2])%m)
    		i+=1


if __name__ == '__main__':
    input = sys.stdin.read();
    n, m = map(int, input.split())
    print(get_fibonaccihuge1(n, m))
