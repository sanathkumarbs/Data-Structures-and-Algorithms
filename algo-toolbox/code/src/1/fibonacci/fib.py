#!/usr/bin/python -tt # Uses python3

def calc_fib(n):
	l = [0, 1]
	for i in range(n-1):
		l.append((l[-1]+l[-2])%10)
	return l[n]

n = int(input())
print(calc_fib(n))