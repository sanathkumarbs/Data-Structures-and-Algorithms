#!/usr/bin/python -tt # Uses python3
import sys

def euclidGCD(a, b):
	if b==0:
		return a
	return euclidGCD(b,a%b)

def lcm(n, m):
	# Use // instead of / as from py3 onwards / will use integer division
	# where as // uses float division
    return abs(m*n//euclidGCD(n,m))

if __name__ == '__main__':
    input = sys.stdin.read()
    a, b = map(int, input.split())
    print(lcm(a, b))

