JavaExercise
============

9E 6.1Exercise
/**
 * Name: Johnny
 * ID: U10216014
 * Ex: 6.1 
 * Information: 
 *      Let user enter the number of score that he/she wants,
 *      and can find the highest score as a standard of the judgment of other score.
 */
import java.util.Scanner;

public class GradeInArray{
	/** Main method */
	public static void main(String[] args){
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a integer that decides the array size.
		System.out.print("Enter the number of students: ");
		int ArraySize = input.nextInt();
		
		// Instantiate a array named scores
		int[] scores = new int[ArraySize];
		
		// Prompt the user to enter score
		System.out.print("Enter "+ ArraySize +" scores: ");
		for (int i = 0; i < ArraySize; i++) {
			scores[i] = input.nextInt();
		}
		
		// Compare scores and find the highest score
		int best = scores[0];
		for (int i = 1; i < ArraySize; i++) {
			if (scores[i] > max)
			best = scores[i];
		}
		
		/** 
		 *  Assign grade based on the following scheme:
		 *	
		 *	Grade is A >= best - 10
		 *  Grade is B >= best - 20
		 *  Grade is C >= best - 30
		 *  Grade is D >= best - 40
		 *  Grade is F otherwise
		 *
		 */
		for (int i = 0; i < ArraySize; i++) {
			if (scores[i] >= best - 10){
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
			}else if (scores[i] >= best - 20){
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
			}else if (scores[i] >= best - 30){
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
			}else if (scores[i] >= best - 40){
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
			}else{
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
			}
		}
	}
}
