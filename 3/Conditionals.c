#include <stdio.h>
/**
* Solution to Day 2: Operators.
* See <a href="https://www.hackerrank.com/challenges/30-conditional-statements/">link</a>
* @author devendiaz
* @version 1.0
*/
int main(int argc, char *argv[]) {
	int N = 0;
	// If  is odd, print Weird
	if (N % 2 != 0) {
		printf("Weird");
		// If  is even and in the inclusive range of 2 to 5, print Not Weird
	} else if (N >= 2 && N <= 5) {
		printf("Not Weird");
		
		// If  is even and in the inclusive range of 6 to 20, print Weird
	} else if (N >= 6 && N <= 20) {
		printf("Weird");
		// If  is even and greater than 20, print Not Weird
	} else if (N > 20) {
		printf("Not Weird");
	}
	return 0;
}