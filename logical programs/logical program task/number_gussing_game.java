package task;

import java.util.Scanner;

public class number_gussing_game {
	
	
public static void main(String args[]) {
	int number=1+(int)(100*Math.random());
	int i,j;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("....Enter the number of trials....");
	int trial=sc.nextInt();
	System.out.println("A number is choosen between 1-100.Guess the number within "+trial+" trials");
	
	for(i=0;i<trial;i++) {
	System.out.println("Guess the number:");
	int gnum=sc.nextInt();
	if(gnum>number) {
		
		System.out.println("The number is less than "+gnum);
	}else if(gnum<number) {
		System.out.println("The number is greater than "+gnum);
	}
	else {
		System.out.println("You guessed the number "+number);
	}
	
	}
	
	if(i==trial) {
		System.out.println("Trial exhaused");
		System.out.println("The number is "+number);
	}
}

}
