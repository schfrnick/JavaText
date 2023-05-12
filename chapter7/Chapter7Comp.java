/**
 * 
 */
package chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author schfr
 *
 */
public class Chapter7Comp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		
		int[][] m = sumColumn();
		System.out.println(Arrays.deepToString(m));
		getColumns(m);
		
		input.close();
	}

	private static void getColumns(int[][] m) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < m[0].length; i++)
		{
			int colTot = 0;
			for(int j = 0; j < m.length; j++)
			{
				colTot += m[j][i];
			}
			
			System.out.println(colTot);
		}
		
		
		
		
	}

	public static int[][] sumColumn() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[][] m = new int[3][4];
		System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
		for( int i = 0; i < m.length; i++)
		{
			for(int j = 0; j < m[i].length; j ++)
			{
				m[i][j] = input.nextInt();
			}
		}
		return m;
	}

}
