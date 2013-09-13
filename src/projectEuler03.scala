  /*
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.

		What is the largest prime factor of the number 600851475143 ?
	 * 
	 * 
	 * 
	 * 
	 * */

import scala.math
import scala.collection.mutable

object projectEuler extends App {
  
  val n :Long= 131954L
  
  //generate list
  val list = mutable.ListBuffer(1)
  var i,k = 2
  
  while(i<=n){
    list += i
    i +=1
  }
  
  //generate prime list
  var list_primos = list    
  while(k<= math.sqrt(n)){
      if(list_primos.contains(k)){
    	  var j = k
    	  while(j <= (n/k)){
    		  list_primos -= k*j
    		  j +=1
    	  }
      }
      k +=1
  }    
  
  val maxPrimo = list_primos.filter(x => n%x==0).max
  
  println(maxPrimo) 

}