import java.util.Scanner; // Scanner is imported.

public class evaluateE {
  /** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create a scanner
		System.out.println("You can enter a non-negative number to estimate the natural number e");
		System.out.print("The number is: ");// Prompt user to enter a number
		int number = input.nextInt(); // user can enter a number
		System.out.printf("%f\n",getValue(number)); // print the result
	}

  /**
   *  User give a number, and pass the number to getValue method
   *  The method can estimate the natural number e
   *  e almost close to 2.718
   */
	static double getValue(int number) {  // A static method load in memory with the class(evaluateE).
		int ziNumber = number;  // number pass to the inner od method.
		int counter = 1;
		double x, sum;
		x = 1.0;
		sum = 1.0;
		while(counter <= ziNumber) {
			x = x / counter;
			sum = sum + x;
			counter = counter + 1;
		}
		return sum;
	}
}
