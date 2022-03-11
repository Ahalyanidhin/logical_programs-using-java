package Assessment.pattern;

import java.util.Scanner;

public class pyramid_star_pattern {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int l=sc.nextInt();
		System.out.println("Enter the symbol");
		String s=sc.next();
		int i,j,k;
		
		for(i=1;i<=l;i++) {
			for(j=l-i;j>0;j--) {
				System.out.print(" ");
			}
		for(k=1;k<=2*i-1;k++) {
			System.out.print(s);
			
		}	
		System.out.println("");
		}
	}
	
}
