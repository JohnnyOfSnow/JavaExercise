import java.util.Scanner;
public class TestStar{
	public static void main(String[] para){
		Scanner input = new Scanner(System.in);
		System.out.print("How many line do you want to display: ");
		int line = input.nextInt();

		while(line > 0){
			int entire = line / 5;
			line = line % 5;
			int block = 2;
			int star = 1;
			int blockFlag = 0;
			int starFlag = 0;
			while(entire > 0){
				for(int i = 1; i <= 5; i++){
					for(int u = 1; u <= block; u++){
						System.out.print(" ");
						
					}

					for(int k = 1; k <= star; k++){
						System.out.print("*");
					}
					
					System.out.print("\n");
					star = star + 2;
					block = block - 1;

					if(star > 5){
						starFlag = 1;
						star = star - 4;
					}else if(starFlag == 1){
						star = star - 4;
					}else{
					}

					if(block < 0){
						blockFlag = 1;
						block = block + 2;
					}else if(blockFlag == 1){
						block = block + 2;
					}else{
					}
									
				}
				block = 2;
				star = 1;
				blockFlag = 0;
				starFlag = 0;
				entire = entire - 1;
			} // end while
			blockFlag = 0;
			starFlag = 0;
			block = 2;
			star = 1;
			for(int i = 1; i <= line; i++){
					
					for(int u = 1; u <= block; u++){
						System.out.print(" ");
						
					}

					for(int k = 1; k <= star; k++){
						System.out.print("*");
					}
					System.out.print("\n");
					star = star + 2;
					block = block - 1;

					if(star > 5){
						starFlag = 1;
						star = star - 4;
					}else if(starFlag == 1){
						star = star - 4;
					}else{
					}

					if(block < 0){
						blockFlag = 1;
						block = block + 2;
					}else if(blockFlag == 1){
						block = block + 2;
					}else{
					}								
			}
			line = 0;			
		}// end while
	}
}
