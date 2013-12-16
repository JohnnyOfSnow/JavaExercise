/**
 * Name: Johnny
 * ID: U10216014
 * Ex: 6.6
 * Information: 
 *      Rewrite listing 4.14(p.189)
 *      Using array to store the prime number that later use them to check another number 
 *      whether is prime or not.
 */
public class PrimeNumberInArray{
	/** Main method */
	public static void main(String[] args){
		final int TOTAL_PRIME_NUMBER = 50;
		final int DISPLAY_OF_LINE = 10;

		/**
		 *  count can decide the prime number's location in array
		 *  With the number increasing, we gradually find the first fifty prime numbers.
		 *  PrimeNumberArray can store prime numbers.
		 */
		int count = 0;
		int number = 2;
		int[] PrimeNumberArray = new int[TOTAL_PRIME_NUMBER];

		// while loop stop until find the first fifty prime numbers.
		while (count < TOTAL_PRIME_NUMBER) {

			// Assuming the number is prime number
			boolean isPrime = true;

			/**
			 *   For loop{
			 *		1.ensure Number of square root is greater than or equal the array's element
			 *		2.count > n(Because 2 is a prime number,I have to store 2 in array.When program
			 *                 	    encounter 0 > 0, 2 is false(not executed the for loop), so 2 can store in array.)
			 *   If
			 *          According to the 6.6, number divide number of square root is greater than or equal the array's element.
			 *          case 1: remainder is 0(not a prime number---false) leave the loop
			 *          case 2: remainder not 0(is a prime number---true ) leave the loop until all possible number have devided.
			 *   }
			 *
			 *   If{
			 *          case 1: isPrime is true (the number will store in array)   
			 *          case 2: isPrime is false(the number won't store in array) 
			 *   }                                             
			 */
			for(int n = 0;count > n && PrimeNumberArray[n] <= Math.sqrt(number); n++){
				if(number % PrimeNumberArray[n]== 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				PrimeNumberArray[count] = number;
				count++;
				if(count % DISPLAY_OF_LINE == 0){
					// Display the number and advance to the new line
					System.out.println(number);
				}else{
					System.out.print(number + " ");
				}				
			}

			// Check if the next number is prime
			number++;
		}
	}
}
