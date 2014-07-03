/**
 * Name: Johnny
 * ID: U10216014
 * Ex: 5.8
 * Information: 
 *      Design a class that contains the celsiusToFahrenheit ,and fahrenheitToCelsius method.
 */
public class TestTempature{
	//Define four variables that are reused by the celsiusToFahrenheit ,and fahrenheitToCelsius method.
	static double celsius = 40.0;
	static double fahrenheit = 120.0;
	static double celsius1 = 0;
	static double fahrenheit1 = 0;

	//Main method
	//use the count to run the while loop for ten times
	//                    When loop runs at a time
	//                    celsius - 1 ,fahrenheit - 10 ,and count - 1
	//Print the result
	public static void main(String[] args){
		System.out.println("Celsius       Fahrenheit       |     Fahrenheit      Celsius");
		System.out.println("------------------------------------------------------------");
    		int count = 10;
    		while(count > 0){    		    		
    			System.out.printf("%3.1f            %6.2f         |       %5.1f        %6.2f\n",celsius,celsiusToFahrenheit(celsius),fahrenheit,fahrenheitToCelsius(fahrenheit));
			celsius = celsius - 1;
			fahrenheit = fahrenheit - 10;    	
    			count = count -1;
    		}	           			
	}

    	//the method can change celsius into fahrenheit
	public static double celsiusToFahrenheit(double celsius){
        	fahrenheit1 = (9.0 / 5) * celsius + 32;
        	return fahrenheit1;
    	}	

    	//the method can change fahrenheit into celsius
	public static double fahrenheitToCelsius(double fahrenheit){
    		celsius1 = (5.0 / 9) * (fahrenheit - 32);
    		return celsius1; 	
    	}			
}
