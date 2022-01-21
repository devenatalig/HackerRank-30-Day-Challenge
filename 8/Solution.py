# Solution to Day 7: Arrays
# See <a href="https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem">link</a>
# @author devendiaz
# @version 1.0
# Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    contacts = {}
    # For each number of contacts to add
    for i in range(0, n):
        # Read entry and add to dict
        new_contact = input().partition(" ")
        contacts[new_contact[0]] = new_contact[2]
        
    # Keep accepting query requests
    for line in sys.stdin:
        try:
            # name to find
            key = line.strip()
            if (contacts.__contains__(key)):
                # phone number for name
                val = contacts.get(key)
                print("{}={}".format(key,val))
            else:
                # if not found
                print("Not found")
        except:
            print("Something went wrong")