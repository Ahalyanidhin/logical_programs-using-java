package Assessment;

import java.util.Arrays;

public class sort_elements_array {

	public static void main(String[] args)   
	{   
	   
	int [] array = new int [] {2,6,7,3,4};  
	
	Arrays.sort(array);   
	System.out.println("Elements of array sorted in ascending order: ");  
	  
	for (int i = 0; i < array.length; i++)   
	{       
	System.out.println(array[i]);   
	}   
	}  

	
}
