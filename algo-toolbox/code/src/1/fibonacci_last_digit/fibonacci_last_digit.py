#!/usr/bin/python -tt # Uses python3
import sys

def get_fibonacci_last_digit(n):
	l = [0, 1]
	for i in range(n-1):
		l.append((l[-1]+l[-2])%10)
	return l[n]

if __name__ == '__main__':
    input = sys.stdin.read()
    n = int(input)
    print(get_fibonacci_last_digit(n))
