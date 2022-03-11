package Assessment.pattern;

import java.util.Scanner;

public class number_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("How many rows ?");
	         
	        Scanner sc = new Scanner(System.in);
	         
	        int rows = sc.nextInt();
	        for(int i=1;i<=rows;i++)
	        {
	        for(int j=rows;j>i;j--)	{
	        	System.out.println(" ");	
	        }
	        int temp=1;
	        for(int k=1;k<=i;k++) {
	        	System.out.println(temp+" ");
	        	temp=temp*(i-k)/(k);
	        }
	        System.out.println();
	        }
	        }
	        
	     
}
