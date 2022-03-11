package task;

public class truthtable {
	
	public static void main(String arg[]) {
		boolean p=true,q=true;
		
		System.out.println("P\tQ\tPANDQ\tPORQ\tPXORQ\tNOTP");
		
	      p=q;
			System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+!p);
			
		
		
			p=true;q=false;
				System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+!p);
							
			
		
			p=false;q=true;
				System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+!p);
				
			
		
			p=false;q=false;
				System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+!p);
				
			
	}
}
	
