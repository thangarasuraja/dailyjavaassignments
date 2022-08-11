package dailytask;

import java.util.Scanner;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class MajorityElementReturnFromArray {

	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		
		n=sc.nextInt();  
		 
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<n; i++)  
		{  
		  
		array[i]=sc.nextInt();  
		}  
		//System.out.println("Array elements are: ");  
		// accessing array elements using the for loop  
		
		
		
		float m=(float)n/2;
		System.out.println(m);
		int roundValue=Math.round(m);
		System.out.println(roundValue);
		
		
		
		for (int i=0; i<n; i++) { 
			int count=1;
		         for (int j = i+1; j < n; j++) {
		        	  if(array[i]== array[j]) {
		        		 count=count+1;
		        		 
		        		 if(count>=roundValue) {
		        			 System.out.println(array[j]);
		        		 }
		        	 }
		        	  
				}
                  
				} 
		
		

	}

}
