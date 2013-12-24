/**
 * Name: Johnny
 * ID: U10216014
 * Ex: http://zerojudge.tw/ShowProblem?problemid=d693(An Online Judge System For Beginners)
 * Information: 
 *      We can get LCD of two integer by product divide GCD(It's easy)
 *      Now, please get the LCD of N integer.
 */
import java.util.Scanner;

public class TestAnotherWayOfLCD{
	/** Main method */
	public static void main(String[] args) {

		System.out.println("The program can get LCD of N postive integer");
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the N.
		System.out.print("How many postive integer you want to get LCD? ");
		int ArraySize = input.nextInt();
		int[] NumberOfArray = new int[ArraySize]; // ArraySize decide the size of array.
		int DisplayCount = 1;

		// Prompt the user to enter N integer.
		for (int i = 0; i < NumberOfArray.length; i++){
			System.out.print("Please enter the " + DisplayCount +" number: ");
			NumberOfArray[i] = input.nextInt();
			DisplayCount ++;
		}

		// If N integer are prime number, so the LCD is product.
		int NumberProduct = 1;
		for (int i = 0; i < NumberOfArray.length; i++){
			NumberProduct = NumberProduct * NumberOfArray[i];
		}
		
		// The smallest LCD is the Largest number in array.
		int LargeNumber = NumberOfArray[0];
		for (int i = 1; i < NumberOfArray.length; i++){
			if (LargeNumber < NumberOfArray[i])
				LargeNumber = NumberOfArray[i];
			
		}

		/**
		 *  LCD: by difintion, LCD can divide all integer(in array)		 
		 */
		int ArrayIndex = 0;
		int count = 0;
		int LCD = 1;
		for (int findLCD = LargeNumber; findLCD <= NumberProduct; findLCD++){
			while (ArrayIndex < NumberOfArray.length){
				if(findLCD % NumberOfArray[ArrayIndex] == 0){
					count = count + 1;	// can divide completly.
				}
				ArrayIndex = ArrayIndex + 1;
			}
			if(count == NumberOfArray.length){  // NumberOfArray.length = N numbers.
				LCD = findLCD;
				break; // find the LCD.
			}
			count = 0;
			ArrayIndex = 0;
		}
		System.out.println("---------------------------");
		System.out.println("The LCD is " + LCD);
	}
}
