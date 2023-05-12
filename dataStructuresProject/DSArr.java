package dataStructuresProject;

public class DSArr {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int maxSize = 100;
		HighArray arr;
		arr = new HighArray(maxSize);
		
		arr.insert(5);
		arr.insert(15);
		arr.insert(25);
		arr.insert(35);
		arr.insert(45);
		arr.insert(55);
		arr.insert(65);
		arr.insert(75);
		arr.insert(85);
		
		
		arr.printArr();
		arr.delete(45);
		arr.printArr();
		
		int search = 5;
		if(arr.binSearch(search))
			System.out.println("found " + search);
		else
			System.out.println("not found");
		
	}

}
