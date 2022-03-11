package Assessment;

import java.util.Arrays;

public class sorting_string {
	
	 static void sortString(String str) {
	        char []arr = str.toCharArray();
	        Arrays.sort(arr);
	        System.out.print(String.valueOf(arr));
	    }
	 
	public static void main(String[] args) {
	        String s = "ahalya";
	        sortString(s);
	    }

}
