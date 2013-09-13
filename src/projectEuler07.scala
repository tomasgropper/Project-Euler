/*
 * 10001st prime
Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*
*/

import scala.Stream
import scala.Stream.cons
import scala.collection.mutable

object projectEuler07 extends App {  
 
  def ints(n: Int): Stream[Int] =
    Stream.cons(n, ints(n+1))       

  def primes(nums: Stream[Int], n: Int): Stream[Int] = {
    if(n == 0) Stream.empty
    else Stream.cons(nums.head, primes ((nums tail) filter (x => x % nums.head != 0), n-1) )
  }

	val b = 10001
	val primos = (primes(ints(2), b)/* take 10000 toList*/).max
	
	println(primos)
}