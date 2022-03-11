package Assessment;

import java.util.Scanner;

public class sumofevenusngarray {
	
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the size of the array : ");
				int size = sc.nextInt();

				int[] Arr = new int[size];

				System.out.println("Enter the elements of the array : ");
				for (int i = 0; i < size; i++) {
				    Arr[i] = sc.nextInt();
				}

				int sum = 0;
				int i = 0;

				while (i < size) {
				    if (Arr[i] % 2 == 0) {
				        sum += Arr[i];
				    }
				    i++;
				}

				System.out.println("Sum of all even numbers in the array is : " + sum);
			}
	    }


}
