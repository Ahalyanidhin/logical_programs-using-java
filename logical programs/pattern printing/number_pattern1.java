package Assessment.pattern;

import java.util.Scanner;

public class number_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("How many rows ?");
	         
	        Scanner sc = new Scanner(System.in);
	         
	        int noOfRows = sc.nextInt();
	         
	        int value = 1;
	         
  
	        for (int i = 1; i <= noOfRows; i++) 
	        {
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(value);
	                 
	                value++;
	            }
	             
	            System.out.println();
	        }
	}

}
