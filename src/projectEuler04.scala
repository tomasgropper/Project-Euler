
/*
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of 
 * two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*
* 
* */

import scala.collection.mutable
import scala.math

object projectEuler04 extends App {
  
  val n = 998001
  
  //generate list
  val list = 1 to n
  
  //generate two digits numbers list
  val list_digits = 100 to 999  
  
 def isPalindromic(x: Int): Boolean = {
    val i = x.toString()
    var n = i.length()-1    
    for(y<-0 to n/2){
      if(!(i(y)==i(n-y))) return false
    }
    return true
   }
 
 def op(number: Int, x: Int): Boolean = {
   val i = number / x
   val _i = i.toString   
   return _i.length == 3
 }
 
 def numberDivisores(number: Int, list: Int*): Int = {
   return list_digits.foldLeft(0)((acum:Int,x:Int)=> if(((number%x)==0) && (op(number,x))){acum+1}else{acum})
 }   
  
  val list_palindrom = list.filter(isPalindromic(_)).filter(numberDivisores(_,list_digits:_*)>=2).max  
  
  println(list_palindrom)	
}