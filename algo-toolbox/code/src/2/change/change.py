#!/usr/bin/python -tt # Uses python3
import sys

def get_change(n):
	count = 0
	
	if(n>=10):
		count = int(n/10)
		n = n%10
	
	if(n>=5):
		count += int(n/5)
		n = n%5
		
	return count+n

if __name__ == '__main__':
    n = int(sys.stdin.read())
    print(get_change(n))
