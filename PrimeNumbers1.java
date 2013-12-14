public class PrimeNumbers1{	 
	public static void main(String[] args){
		int number = 3;
		int[] PrimeNumberArray = new int[50];
		int count = 1;
		PrimeNumberArray[0] = 2;
		int PrimeCount = 1;
		while(PrimeCount < 50){
			
			boolean prime = true;
			int max = (int)(Math.pow(number, 1 / 2));

			for (int j = 0; PrimeNumberArray[j] <= count; j++) { 
	            		if ((number % PrimeNumberArray[j]) == 0) { 
	                		prime = false; 
	                	 
	            		} 
	        	} 
	        	
			if (prime) { 
            			PrimeNumberArray[PrimeCount] = number; 
	        		PrimeCount = PrimeCount + 1;
	        		
	    		} 
	    		number = number + 1;
		}
		
		int k = 0;
		while(k < 50){
			System.out.println(PrimeNumberArray[k]+" ");
			k = k + 1;
		}		
	}    

}
