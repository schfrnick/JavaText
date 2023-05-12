package mergeSort;
import java.util.Arrays;
import java.util.Random;

public class mergeMe {

	public static void mergeSort(int[] tempArray, int End, int Begin)
	{
		
		
		
		if(Begin<End)
		{
			int mid = (End + Begin)/2;
			mergeSort(tempArray, mid, Begin);
			mergeSort(tempArray, End, mid+1);
			
			merge(tempArray,Begin,mid,End);
		}
		

		
		return;
	}
	
	private static void merge(int[] eArray, int begin, int mid, int end) 
	{
		
		int[] tempArray = new int[end - begin +1];
		
		int i = begin, j = mid+1, k = 0;
		//we are loading our original array in to a new temporay array to sort them without distorting the original array
		while(i <=mid && j <=end)
		{
			//check if we are at the end of the array segment;
			if(eArray[i] <= eArray[j])
			{
				//store i in the new array and increment
				tempArray[k] = eArray[i];
				i++;
				k++;
				
			}
			else{
				//store j in the new array and increment
				tempArray[k] = eArray[j];
				j++;
				k++;
				
			}
		}//adding any remaining values to the array
		while(i <= mid)
		{
			tempArray[k]= eArray[i];
			i++;
			k++;
			
		}//adding any remaining values to the array
		while(j <= end)
		{
			tempArray[k]= eArray[j];
			j++;
			k++;
			
		}
		
		//we then load our new array in to the positions of the original array
		
		for(i= begin; i <= end;i++)
		{
			eArray[i]= tempArray[i-begin];
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] intArray = new int[] {-5,20,10,3,2,0};
		
		mergeSort(intArray,intArray.length-1, 0);
		
		System.out.println(Arrays.toString(intArray));

	}

}
