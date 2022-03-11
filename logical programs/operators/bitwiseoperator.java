package operators;

public class bitwiseoperator {
	public static void main(String args[]) {
		int x=2,y=3,z=0;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(~y);
		
		z=x>>3;
		System.out.println(z);
		
		z=y<<2;
		System.out.println(z);
		
		z=y<<3;
		System.out.println(z);
		z=y>>>2;
		System.out.println(z);
		
	}

}
