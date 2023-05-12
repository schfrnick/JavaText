package dataStructuresProject;

public class HighArray {
	private long[]	a;
	private int nElements;
	
	
	public HighArray(int maxElements)
	{
		
		a = new long[maxElements];
		nElements = 0;
	}
	public boolean findVal(long searchVal)
	{
		for(int i =0; i<nElements; i++ )
		{
			if(searchVal == a[i])
			{
				return true;
			}
		}
		return false;
	}
	
	public void insert(long valInsert) {
		
		a[nElements] = valInsert;
		nElements++;
		
	}
	
	public boolean binSearch(long searchVal)
	{
		int highSize = nElements -1;
		int lowSize = 0;
		int numLoop = 0;
		int curInt;
		
		while(true)
		{
			
			curInt=(highSize + lowSize) / 2;
			if(a[curInt] == searchVal)
			{
				numLoop++;
				System.out.println("num of checks "+ numLoop);
				return true;
			}
			else if (highSize == lowSize)
			{
				System.out.println("not found");
				return false;
			}
			else
			{
				if(a[curInt] < searchVal)
				{
					lowSize = curInt +1;
					
				}
				else
				{
					highSize = curInt -1;
					
				}
			}
			System.out.println("currentVal	"+ a[curInt]);
			numLoop++;
		}
		
		
		
		
	}
	
	public boolean delete(long valDelete)
	{
		
		for(int i = 0; i < nElements; i++)
		{
			if(valDelete == a[i])
			{
				for(int n = i+1; n <= nElements; n++)
				{
					long temp = a[n];
					a[i] = temp;
					i++;
					
				}
				nElements--;
				break;
			}
			
			if(i == nElements)
			{
				return false;
			}
		}
		
		
		return true;
	}
	
	public void printArr()
	{
		
		for(int i = 0; i<nElements; i++)
		{
			System.out.println(a[i]);
			
		}
		return;
	}
}
