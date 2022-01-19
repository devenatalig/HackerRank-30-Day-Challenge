#!/usr/bin/env python3

#!/bin/python3

# Solution to Day 7: Arrays
# See <a href="https://www.hackerrank.com/challenges/30-arrays/problem">link</a>
# @author devendiaz
# @version 1.0
# Given an array of integers, print 's elements in reverse order as a single line of space-separated numbers.

import math
import os
import random
import re
import sys



if __name__ == '__main__':
	n = int(input().strip())
	
	arr = list(map(int, input().rstrip().split()))
	# Reverses array COOL!
	res = arr[::-1]
	
	for i in range(0, len(res)):
		# print with a following space
		print(res[i],end=" ")
		