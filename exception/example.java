package exception;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try {
//	int x=4/0;
//	System.out.println("Answer is"+x);
//}catch(ArithmeticException e) {
//	System.out.println("Arithmetic Exception");
//}
	
	
	try {
		String s="hello";
		int a=Integer.parseInt(s);
		System.out.println("s is"+a);
	}catch(Exception e) {
		System.out.println("Number Format Exception");
	}
	try {
		String n=null;
		System.out.println(n.length());
	}
	catch(Exception e) {
		System.out.println("Null Pointer Exception");
	}
	
	try {
		int a[]=new int[3];
		System.out.println(a[4]);
	}
	catch(Exception e) {
		System.out.println("ArrayIndexOutofBoundsException...");
	}
	
	
	
	
	
	}

}
