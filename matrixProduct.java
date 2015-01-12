/**
 * Name: Johnny
 * ID: U10216014
 * Ex: Count matrix product need how many addition and multiplication
 * Information: 
 *       A linear algebra problem, a n*n matrix has k's power.
 *		 Count matrix product need how many addition and multiplication
 *
 *		 From this program, you can the answer. 
 */
import java.util.Scanner;

public class matrixProduct{
	public static void main(String[] args) {
//                        0  1  2  3  4  5  6  7  8
// ===================================================
	int[][] conn = {{ 0, 1, 0, 0},  // 0
			{ 1, 0, 0, 1},  // 1
			{ 1, 2, 0, 1},  // 2
			{ 0, 0, 0, 3}  };// 3

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number for the matrix power: "); // prompt user to enter
		int power = input.nextInt();

		doProduct(conn,power);
	}

	static void doProduct(int[][] matrix, int times){
		int displayTimes = times;
		int addTime = 0;
		int productTime = 0;
		int[][] tempResult = new int[matrix.length][matrix.length];
		int[][] result = new int[matrix.length][matrix.length]; // put the correct result

		/** do the matrix product*/
		for(int i = 0; i < matrix.length; i++)
			for(int j = 0; j < matrix[i].length; j++){
				tempResult[i][j] = 0;
				for(int k = 0; k < matrix.length; k++){
					tempResult[i][j] = tempResult[i][j] + (matrix[i][k] * matrix[k][j]);
					addTime = addTime + 1;
					productTime = productTime + 1;
				}
			}

		/** copy the result */
		for(int q = 0; q < result.length; q++){
				for(int w = 0; w < result[q].length; w++){
					result[q][w] = tempResult[q][w];
				}
		}

		/** for power is above 2*/
		while(times != 2){
			for(int i = 0; i < matrix.length; i++)
				for(int j = 0; j < matrix[i].length; j++){
					result[i][j] = 0;
					for(int k = 0; k < matrix.length; k++){
						result[i][j] = result[i][j] + (tempResult[i][k] * matrix[k][j]);
						addTime = addTime + 1;
						productTime = productTime + 1;
				}
			}

			/** copy the result */
			for(int h = 0; h < result.length; h++){
				for(int o = 0; o < result[h].length; o++){
					tempResult[h][o] = result[h][o];
				}
			}
			times = times - 1;
		}

		/** displat the result */
		for(int s = 0; s < result.length; s++){
			System.out.println("");
			for(int t = 0; t < result[s].length; t++){
				System.out.print(result[s][t] + ", ");
			}
			
		}

		/** need  n*n*n*(k - 1) times addition and multiplication */
		System.out.println("\n" + matrix.length + "*" + matrix.length + " power is " + displayTimes + 
			" matrix totally, do " + addTime + " addition, do "+ productTime + " multiplication");
	}
}
