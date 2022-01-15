#!/usr/bin/env python3
# Solution to Day 5: Loops
# See <a href="https://www.hackerrank.com/challenges/30-loops/problem">link</a>
# @author devendiaz
# @version 1.0
# given n, print first 10 multiples on a new line
# n * i = a

def main():
	n = 5
	# from 1 to 10
	# a ≤ x < b
	for i in range(1,11):
		strOut = "{} x {} = {}"
		print(strOut.format(n,i,n*i));
		
main()