import scala.collection.mutable
import scala.math



object projectEuler extends App {
	
  /*
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.

		What is the largest prime factor of the number 600851475143 ?
	 * 
	 * 
	 * 
	 * 
	 * */
  
  
  val n :Long= 13195L
  
  //generate list
  val list = 1 to n
  
  //generate prime list
  var list_primos = list
    
  while(k<= math.sqrt(n)){
      if(list_primos.contains(k)){
    	  var j = k
    	  while(j <= (n/k)){
    		  list_primos -= k*j
    		  j = j+1
    	  }
      }
      k = k+1
  }    
  
  val maxPrimo = list_primos.filter(x => n%x==0).max
  
  println(maxPrimo)
  

}