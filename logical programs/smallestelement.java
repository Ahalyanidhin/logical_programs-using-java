package Assessment;

public class smallestelement {
	
	 public static void main(String args[]) {  
		  
	        
	        int arr[] =  {5,8,10,98};  
	       
	        int min = arr[0];  
	       
	        for (int i = 0; i < arr.length; i++) {  
	            
	           if(arr[i] < min)  
	               min = arr[i];  
	        }  
	        System.out.println("Smallest element present in given array: " + min);  
	    }

}
