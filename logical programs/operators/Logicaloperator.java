package operators;

import java.util.Scanner;

public class Logicaloperator {
	
	public static void main (String [] args)
    {
		 int x,y,z; 
         Scanner scan = new Scanner(System.in); 
         System.out.print("Enter the Value of x : "); 
         x=scan.nextInt(); 
         System.out.print("Enter the Value of y : "); 
         y=scan.nextInt(); 
         System.out.print("Enter the Value of z : "); 
         z=scan.nextInt(); 
         System.out.println("x>y and x>z : "+((x>y) &&(x>z))); 
         System.out.println("x not equal to z : "+(x!=z));
    }

}
