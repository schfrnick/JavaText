package chapter5;
import java.util.LinkedList;



public class Chap5Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 100; i++)
		{
			
			getPentagonalNumber(i);
			int temp = i%10;
			if(temp == 0)
			{
				System.out.println("");
			}
		}
		
		
		
		long f = 234;
		sumDigits(f);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Reversing 456");
		reverse(456);
		System.out.println("");
		System.out.println("");
		System.out.println("Reversing 121");
		reverse(121);
		
	}

	
	
	
	
	
	
	private static void reverse(int i) {
		// TODO Auto-generated method stub
		int newVal = 0;
		int origVal = i;
		
		LinkedList<Integer> nums = new LinkedList<Integer>();
		while(origVal != 0)
		{
		int temp = origVal %10;
		nums.add(temp);
		origVal = origVal / 10;
			
			
		}
		
		int exp = nums.size();
		for(int q = 0; q < nums.size(); q++)
		{
			
			exp--;
			
			int temp = (int) Math.pow(10, exp);
			newVal += (temp * nums.get(q));
			
		}
		
		
		System.out.println("checking if palindrome \nbeep boop\n " + newVal);
			
			
			
			if (isPalindrome(newVal, i) == true)
				{
				System.out.println("This is a palindrome");
				
				}
			else
			{
				System.out.println("This is not a palindrome");
			}
			
	}







	private static boolean isPalindrome(int newVal, int i) {
		
		if(newVal == i)
		{
			return true ;
			
		}
		else
		{
			return false;
		}
		
		// TODO Auto-generated method stub
		
		
		
	}


	private static void sumDigits(long f) {
		// TODO Auto-generated method stub
		long val = f;
		LinkedList<Long> nums = new LinkedList<Long>();
		while(val != 0 )
		{
		long temp = val % 10;
		nums.add(temp);
		val = val/10;
		
		}
		System.out.println(nums);
		int size = nums.size();
		long totalVal = 0;
		for(int i = 0; i <size ; i++)
		{
			
			
			totalVal += nums.get(i);
		}
		
		System.out.println(totalVal);
		
		
		
	}







	private static void getPentagonalNumber(int i) {
		// TODO Auto-generated method stub
		int val = i;
		int temp = val* ((3 * val)-1)/2;
		System.out.print(temp + "     ");
	}

}
