import java.util.*;

public class PrintPrimes {
	public void Main(String[] args) {
		getPrimes();
	}

// pre: 
// post: This method gets the first 100 primes and stores them in a list.	
	public void getPrimes() {
	 // we know 2 will be the first prime #
		int countPrimes = 1;
	 // start at 3 b/c we know 1 is not prime & 2 is even
		int test = 3;
	 // stores the prime numbers;	
		ArrayList<Integer> storePrimes = new ArrayList<Integer>();
		storePrimes.add(2); // special case, 2 is the only even prime
	 // we want the first 100 primes
		while(countPrimes < 100) {
		 // the number is prime ONLY IF it is NOT divisible by all of these numbers,
		 // even #s > 2 will never be prime	
		
		//	if the number is prime/checkPrime returns true;	
			if(checkPrime(storePrimes, test)) {
			//  we have an arraylist, so the size will change as well	
				storePrimes.add(test); 
				countPrimes++;
			}
			test++; // test next value
		}
	}
	
// 	pre: Takes in a collection of all the currently found primes and a test value.
//	Checks whether the passed value is prime by testing if it is divisible by the current
//	prime numbers that have already been stored. Returns true if the # is prime (not divisible
//	by any of the stored primes), otherwise false.	
	private boolean checkPrime(ArrayList<Integer> storePrimes, int test) {
		
		for(int i = 0; i < storePrimes.size(); i++) {
		 // # is not prime if it is divisible by any of the previous prime #s 	
			if(test % storePrimes.get(i) == 0 ) { 
				return false;
			}
		}
		return true; // the # is prime
	}
}