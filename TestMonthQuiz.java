/**
 * Name: Johnny
 * ID: U10216014
 * Ex: From PrintCalendar.java 's class
 * Information: 
 *      The program explains why I rewrite the getMonthName method.
 *      I can use it to write the program(define a class can reuse )
 */


import java.util.Scanner;

public class TestMonthQuiz {
  public static void main(String[] args){

    System.out.println("This program is a exercise about month ");
    System.out.println("User answer the question by inputing a integer");
    System.out.println("-----------------------------------------------------");
    double newRandomMonth = Math.random()* 11 + 1;
    int randomMonth = (int)Math.floor(newRandomMonth);
   
    Scanner input = new Scanner(System.in);
    Months myMonth = new Months();
    System.out.println("What is " + myMonth.getMonthName(randomMonth) + " mean" + "?  ");
    

    int answer = input.nextInt();
    System.out.println("------------------------------------------------------");
    System.out.println(myMonth.getMonthName(randomMonth) + " in Chinese is " + randomMonth  + "月" );
    System.out.print("your answer is " + (answer == randomMonth));
  }
}

//Define the month class with two constructors
class Months{

	/** A no-arg constuctor can give variables initial value */
	Months(){
		String month = "";
	}

	/** Get the English name for the month */
  String getMonthName(int month) {
    String monthName = "";
    switch (month) {
      case 1: monthName = "January"; break;
      case 2: monthName = "February"; break;
      case 3: monthName = "March"; break;
      case 4: monthName = "April"; break;
      case 5: monthName = "May"; break;
      case 6: monthName = "June"; break;
      case 7: monthName = "July"; break;
      case 8: monthName = "August"; break;
      case 9: monthName = "September"; break;
      case 10: monthName = "October"; break;
      case 11: monthName = "November"; break;
      case 12: monthName = "December";
    }

    return monthName;
  }
}
