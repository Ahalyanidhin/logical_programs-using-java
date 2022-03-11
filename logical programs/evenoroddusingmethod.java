package Assessment;

import java.util.Scanner;

public class evenoroddusingmethod {
	
	
		
		static void Oddeven(int num){
		if(num%2==0) 
		    System.out.println(num+" is even"); 
		else 
		    System.out.println(num+" is odd");
		}
		public static void main (String args[]){
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter the number for check odd or even: ");
			int num=sc.nextInt();
			
			Oddeven(num);
			}
}
