import java.util.*;

public class StringReverseAdd{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		int count = 1;
		int[] numberArray = new int[times];


		while(count <= times){
			int number = input.nextInt();
			numberArray[count - 1] = number;
			count = count + 1;
		}

		

		
	}



	static String numberHandle(int number){

		int originally = number;
		String number2 = String.valueOf(number);
		char[number2.length] reverseNumber; 

		int count = 0;

		// reverse
		for(int j = number2.length - 1; j >=0; j--){
			reverseNumber[count] = number2.charAt(j);
			count = count + 1;
		}

		String charArrayNumber = String.valueOf(reverseNumber); // char array to string
		int reverseNumberByArray = Integer.parseInt(charArrayNumber); // string to integer

		int paidioary = originally + reverseNumberByArray;

		String paidioaryToString = String.valueOf(paidioary); // add and convert integer to string.

		
	}
}
