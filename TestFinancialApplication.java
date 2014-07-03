/**
 * Name: Johnny
 * ID: U10216014
 * Ex: 5.15
 * Information: 
 *      Use the method of question,and print a tax table
 */
public class TestFinancialApplication{

	//Define ten variables that are reused by all method in this class 
	static double TaxableIncome = 50000;
	static int status = 1;
	static double tax1 = 0;
	static double tax2 = 0;
	static double tax3 = 0;
	static double tax4 = 0;
	static double tax1toint = 0;
	static double tax2toint = 0;
	static double tax3toint = 0;
	static double tax4toint = 0;

	//Main method 
	//use the count to run the while loop for 200 times
	//                    When loop runs at a time
	//                    get the four kinds of tax
	//Print the result
	public static void main(String[] args){
		System.out.println(" Taxable   Single   Married Joint    Married    Head of");
		System.out.println(" Income             or Qualifying    Separate   a House");
		System.out.println("                    Widow(er)                          ");
		System.out.println("-------------------------------------------------------");

		int count = 201 ;
		while(count > 0){
			System.out.printf("%6.0f   %6.0f   %6.0f           %6.0f     %6.0f\n",TaxableIncome,computetax(1,TaxableIncome),computetax(2,TaxableIncome),computetax(3,TaxableIncome),computetax(4,TaxableIncome));
			TaxableIncome = TaxableIncome + 50;
			count = count - 1;	
		}
	}

	//the method is used to calculate the four kinds of tax
	//
	//the conditions
	//              1 = Single
	//              2 = Married Joint or Qualifying Widow(er)
	//              3 = Married Separate
	//              4 = Head of a House
	//
	public static double computetax(int status, double taxableIncome){

		if(status == 1){
			tax1 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (TaxableIncome - 33950) * 0.25;
			tax1toint = Math.ceil(tax1);
			return tax1toint;
		}else if(status == 2){
			tax2 = 16700 * 0.10 + (TaxableIncome - 16700) * 0.15 ;
			tax2toint = Math.ceil(tax2);
			return tax2toint;
		}else if(status == 3){
			tax3 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (TaxableIncome - 33950) * 0.25;
			tax3toint = Math.ceil(tax3);
			return tax3toint;
		}else{
			tax4 = 11950 * 0.10 + (45500 - 11950) * 0.15 +(TaxableIncome - 45500) * 0.25;;
			tax4toint = Math.rint(tax4);
			return tax4toint;
		}
	}
}
