package Assessment.pattern;

import java.util.Scanner;

public class left_arrow_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int l=sc.nextInt();
		System.out.println("Enter the symbol");
		String s=sc.next();
		int i,j,k;
		
		for(i=0;i<l;i++) {
			for(j=1;j<l-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=l-i;k++) {
				System.out.print(s);
			}
			System.out.println("");
		}
		
		for(i=l-1;i>0;i--) {
			for(j=0;j<l-i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<=l-i;k++) {
				System.out.print(s);
			}
			System.out.println("");
		
		}
		

	}

}
