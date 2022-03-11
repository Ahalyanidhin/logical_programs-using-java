package Assessment;

public class palindrome_recursion {
	static int rev(int n, int temp)
	{
	   
	    if (n == 0)
	        return temp;
	 
	   
	    temp = (temp * 10) + (n % 10);
	 
	    return rev(n / 10, temp);
	}
	 
	
	public static void main (String[] args)
	{
	    int n = 587;
	    int temp = rev(n, 0);
	     
	    if (temp == n)
	        System.out.println("is a palindrome");
	    else
	        System.out.println("not a palindrome" );
	}
}
