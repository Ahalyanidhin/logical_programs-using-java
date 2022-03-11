package Assessment.pattern;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the limit:");
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();


for(i=0;i<l;i++) {
	for(j=0;j<=i;j++) {
		System.out.print(j+"");
	}
	System.out.println();
}
	}

}
