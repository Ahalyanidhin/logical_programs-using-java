package Assessment;

public class reverse_string_ung_recursion {
	public void reverseString(String string)   
	{   
	if ((string==null)||(string.length() <= 1))   
	System.out.println(string);   
	else  
	{   
	System.out.print(string.charAt(string.length()-1));   
	reverseString(string.substring(0,string.length()-1));   
	}   
	}   
	public static void main(String[] args)   
	{   
	  
	String str = "i am happy";   
	reverse_string_ung_recursion rs = new reverse_string_ung_recursion();  
	   
	rs.reverseString(str);   
	}      

}
