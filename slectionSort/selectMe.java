package slectionSort;

import java.util.Arrays;

public class selectMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {-5,20,10,3,2,0};
			
		selectionSort(intArray);
		
		System.out.println(Arrays.toString(intArray));
	}

	
	
	
	
	
	private static void selectionSort(int[] intArray) {
		// TODO Auto-generated method stub
		int i = 0;
		int curCheck = intArray[i];
		System.out.println("hello world");
		while(i < intArray.length -1)
		{
			curCheck = intArray[i]; //head location value is stored in current check
			int locCheck = i+ 1; //increment to first comparison and store
			int valCheck = intArray[locCheck]; //store first comparison value
			int curSmall = i;
			while(locCheck < intArray.length)
			{
				
				valCheck = intArray[locCheck];
				if(valCheck < intArray[curSmall])
				{
				curSmall = locCheck;
				
				}
			  locCheck++;
				
			}
			System.out.println( "current index value " + intArray[i]);
			System.out.println( "current swap value " +  intArray[curSmall]);
			 if(intArray[i] > intArray[curSmall])
				{
				 
				 	int temp = intArray[i];
				 	intArray[i] = intArray[curSmall];
				 	intArray[curSmall] = temp;
				}
				locCheck++;
			 
				
				i++;
		}
		
		
	}

	
	
}
