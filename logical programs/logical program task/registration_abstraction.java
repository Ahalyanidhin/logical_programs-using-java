package task;

import java.util.Scanner;

public class registration_abstraction {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("REGISTRATION FORM");
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your address:");
		String address=sc.next();
		System.out.println("Enter your contact number:");
		int number=sc.nextInt();
		System.out.println("Enter your email_id:");
		String email=sc.next();
		System.out.println("Enter the proof type:");
		String proof=sc.next();
		System.out.println("Enter the proof_id:");
		String proof_id=sc.next();
		registration r=new registration();
		r.display(name, address, number, email, proof, proof_id);
	}

}

abstract class details{
	
	abstract void display (String name,String address,int number,String email,String proof,String proof_id);
	public void update(String name,String address,int number,String email,String proof,String proof_id) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter your updated email_id:");
		String email1=scr.next();
System.out.println("YOUR DETAILS");
System.out.println("------------");
System.out.println("Your name is:"+name);	
System.out.println("Your address is:"+address);
System.out.println("Your contact number is:"+number);
System.out.println("Your Email_id is:"+email1);
System.out.println("Your proof type :"+proof);
System.out.println("Your proof_id :"+proof_id);
		
	}
	
}
class registration extends details{
	
	public void display(String name,String address,int number,String email,String proof,String proof_id) {
	System.out.println("Your name is:"+name);	
	System.out.println("Your address is:"+address);
	System.out.println("Your contact number is:"+number);
	System.out.println("Your Email_id is:"+email);
	System.out.println("Your proof type :"+proof);
	System.out.println("Your proof_id :"+proof_id);
	System.out.println("Thank you for registering your id is 1...");
	System.out.println("Do you want to continue registration??");
	System.out.println("Yes/No");
	Scanner s=new Scanner(System.in);
	String rly=s.next();
	if(rly.equals("yes")==true) {
		update(name,address,number,email,proof,proof_id);
	}
	else {
		return;
	}
	
	
	}

	}