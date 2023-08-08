public class RunningTimeClass {

	// count the number of prime numbers between 2 and n 
    public static int countPrimes(int n) {
        
    	// a counter to store the number of prime numbers
    	int count = 0;
    	
    	// start from 2, count the number of prime numbers less than n
        for(int i = 2; i<n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    
    
    // is n a prime number? 
    private static boolean isPrime(int n) {
        
    	// compute square root of n 
    	int root = (int) Math.sqrt(n);
    	
    	// see all numbers smaller than square root of n and check if n is divisible 
    	int d = 2;
        while(d<=root){
        	
        	// n is divisible by d :
            if(n%d==0){
            	// n is not prime
                return false;
            }
            
            // go to the next d
            d++;
        }
        // n is prime
        return true;
    }	
	
    
	public static void main(String[] args) {

		// Experimental study to compute running time
		
		
		// lets compute the number of prime numbers less than "max_number"
		int max_number = 1000000;
		
		// start the clock
		final long start = System.currentTimeMillis();
		
		//your program ...
		int result = countPrimes(max_number);
		System.out.println("There are "+result+" prime numbers less than "+max_number);
				
		// end the clock
		final long end = System.currentTimeMillis();
		
		//print the running time in milliseconds using my core-i7 cpu
		System.out.println("\n Took: " + ((end - start)) + "ms");
	
		
	}

}
