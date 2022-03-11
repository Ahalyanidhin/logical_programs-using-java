package Assessment;

public class largestelement {
	
	  public static void main(String args[]) {  
		  
	        
	        int arr[] =  {5,8,10,98};  
	       
	        int max = arr[0];  
	       
	        for (int i = 0; i < arr.length; i++) {  
	            
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);  
	    }  

}
