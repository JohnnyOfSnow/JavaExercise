JavaExercise
============

9E 6.1Exercise

import java.util.Scanner;

public class GradeInArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int ArraySize = input.nextInt();
		int[] scores = new int[ArraySize];
		
		System.out.print("Enter "+ ArraySize +" scores: ");
		for (int i = 0; i < ArraySize; i++) {
			scores[i] = input.nextInt();
		}
		
		int max = scores[0];
		for (int i = 1; i < ArraySize; i++) {
			if (scores[i] > max)
			best = scores[i];
		}
		
		for (int i = 0; i < ArraySize; i++) {
			if (scores[i] >= best - 10){
				System.out.println("Student " + i + "score is " + scores[i] + "and grade is A");
			}else if (scores[i] >= best - 20){
				System.out.println("Student " + i + "score is " + scores[i] + "and grade is B");
			}else if (scores[i] >= best - 30){
				System.out.println("Student " + i + "score is " + scores[i] + "and grade is C");
			}else if (scores[i] >= best - 40){
				System.out.println("Student " + i + "score is " + scores[i] + "and grade is D");
			}else{
				System.out.println("Student " + i + "score is " + scores[i] + "and grade is F");
			}
		}
	}
}
