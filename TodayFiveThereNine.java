/**
 * Name: Johnny
 * ID: U10216014
 * Ex: p.257~259
 * Information: 
 *      Because Java teacher said the LottoNumbers.java don't like Lottery, 
 *      and my mom very likes TodayFiveThereNine.
 *      Therefore, I write the program to simulate TodayFiveThereNine.
 *      (This is not homework)
 */

import java.util.Scanner;

public class TodayFiveThereNine{
	/** Main method */
	public static void main(String[] args){
		// Create a scanner
		Scanner input = new Scanner(System.in);

		/**
		 *  Create a array to store the winning number.
		 *	According to the rule of TodayFiveThereNine, the array size is five
		 *  For loop can generate five random number.
		 */
		int[] WinningOfNumbers = new int[5];
		for (int i = 0; i < WinningOfNumbers.length; i++) {
			WinningOfNumbers[i] = (int)(Math.random() * 39) + 1;
		}

		/**
		 *  Checking the numbers whether are same or not.
		 *  case: have the same number(should random another number)
		 */
		int RepeatCount = 0;
		for (int i = 0; i < WinningOfNumbers.length; i++) {
			for (int k = 0; k < i; k++) {
				if(WinningOfNumbers[i] == WinningOfNumbers[k]){
					WinningOfNumbers[i] = (int)(Math.random() * 39) + 1;
					RepeatCount = RepeatCount + 1;
				}
			}
			if (RepeatCount > 0) {
				RepeatCount = 0;
				i = i - 1;
			}
		}

		// Create a array to store the player number, and prompt user to enter.
		int[] PlayerOfNumbers = new int[5];
		System.out.print("Enter your number: ");
		for (int i = 0; i < PlayerOfNumbers.length; i++) {
			PlayerOfNumbers[i] = input.nextInt();
		}

		/**
		 *  player number vs. winning number
		 *  case: player number = winning number     WinningCount + 1
		 *  case: player number not winning number  
		 */
		int WinningCount = 0;
		for (int i = 0; i < PlayerOfNumbers.length; i++) {
			for (int j = 0; j < WinningOfNumbers.length; j++) {
				if (PlayerOfNumbers[i] == WinningOfNumbers[j]) {
					WinningCount = WinningCount + 1;
				}
			}

		}

		// Display the winning number.
		System.out.print("Winning numbers are ");
		for (int i = 0; i < WinningOfNumbers.length; i++){
			System.out.print(WinningOfNumbers[i] + " ");
		}

		/**
		 *  According to WinningCount.
		 *  case5 : You get $8,000,000
		 *  case4 : You get $20,000
		 *  case3 : You get $300
		 *  case2 : You get $50
		 *  otherwise You get $0
		 */
		System.out.printf("\n");
		switch(WinningCount){
			case 5:
				System.out.println("You get $8,000,000");
			break;
			case 4:
				System.out.println("You get $20,000");
			break;
			case 3:
				System.out.println("You get $300");
			break;
			case 2:
				System.out.println("You get $50");
			break;
			default:
				System.out.println("You get $0");
		}
	}
}
