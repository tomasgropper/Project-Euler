/*
 *
Summation of primes
Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdint.h>
#include <inttypes.h>

int main(){

	uint64_t n = 2000000;
	int *list = malloc((sizeof(int)*n)+1);
	uint64_t i,j,k;
	for(i=0; i<n; i++) list[i]=i;
	uint64_t acum = 0;

	for(i=2; i <= sqrt(2000000); i++){
		if(list[i]!=0){
			for(j=i; j <= (n/i); j++){
				list[i*j] = 0;
			}
		}
	}

	for(k=2; k < 2000000; k++) acum = acum + list[k];

	printf("%" PRIu64 "\n", acum);

	return 1;
}


