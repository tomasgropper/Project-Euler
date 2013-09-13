/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*
*/

import scala.Stream
import scala.Stream.cons
import scala.collection.mutable

object projectEuler09 extends App {
	
def isPyTriplet(a: Int, b: Int, c: Int) :Boolean = return (a*a+b*b == c*c)
 
var (a,b,c) = (0,0,0)

def findPyTriplet(): (Int,Int,Int) = {
  for(i<-1 until 1000){
	  for(j<-1 until 1000){
		  for(k<-1 until 1000){
			  if((i+j+k)==1000 && isPyTriplet(i, j, k)){
		        return (i,j,k)
			  }
		  }
	  }
  }
  return (0,0,0)
}

val tuple = findPyTriplet()

println(tuple)  
  
}