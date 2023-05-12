package chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Chap6Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reverse a Linked List
		
		
		
		
		//6.2
		Scanner input = new Scanner(System.in);
		
		
		String numSet = input.nextLine();
		List<Integer> splitNums = Arrays.stream(numSet.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		for(int i = splitNums.size() -1; i >= 0 ; i--)
		{
			System.out.print(splitNums.get(i)+ " ");
			
		}
		
		
		//6.12
		min(splitNums);
		
		
		
		
		
		//6.1
		String uInput = input.nextLine();
		
		String[] tokens = uInput.split(" ");
		
		for(int i = 0; i < tokens.length; i++)
		{
			int f = Integer.parseInt(tokens[i]);
			if(f < 60)
			{
				System.out.println(" Person " + i + " Received a F with a score of " + tokens[i]);
				continue;
			}
			else if (f < 70 )
			{
				System.out.println(" Person " + i + " Received a D with a score of " + tokens[i]);
				continue;
			}
			else if (f <80 )
			{
				System.out.println(" Person " + i + " Received a C with a score of " + tokens[i]);
				continue;
			}
			else if (f < 90 )
			{
				System.out.println(" Person " + i + " Received a B with a score of " + tokens[i]);
				continue;
				
			}
			
			System.out.println(" Person " + i + " Received a A with a score of " + tokens[i]);
		}
		
		
	}

	private static void min(List<Integer> splitNums) {
		// TODO Auto-generated method stub
		
		int f = splitNums.get(0);
		for(int i = 0; i < splitNums.size(); i++)
		{
			
			if( splitNums.get(i) < f)
			{
				f = splitNums.get(i);
			}
			
		}
		System.out.println("smallest value is " + f);
		
	}

}
