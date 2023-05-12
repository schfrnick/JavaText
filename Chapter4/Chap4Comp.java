/**
 * 
 */
package Chapter4;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author schfr
 *
 */
public class Chap4Comp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan Amount" );
		int loanAmount = input.nextInt();
		System.out.println("Enter number of years must be greater than zero " );
		int termYears = input.nextInt();
		
		System.out.println("Loan Amount " + loanAmount +   "\nNumber of months " + termYears);
		
		
		System.out.println("Interest Rate			Monthly Payment 		Total Payment ");
		System.out.println("\n");
		loanCalc(loanAmount, termYears);
		
		
	}

	private static void loanCalc(int loanAmount, int termYears) {
		// TODO Auto-generated method stub
		
		int months =(termYears * 12);
		
		//double r = 5.00/1200;
		for(double r = 5.00; r<= 8; r+=.125)
		{
			double newRate = r/1200;
			double top = (double) Math.pow((newRate+1), months);
			
			
			double bottom = ((double) Math.pow(newRate+1, months)) - 1;
			
			
			double payment = loanAmount * newRate / (1-1/Math.pow(1+ newRate, termYears * 12));
			
			double totPayment = payment * termYears * 12;
			
			System.out.println(r + "%" + "				" + (int) (payment * 100)/100.00 + "				" +  (int) (totPayment * 100)/100.00);
			
		}
	}

}
