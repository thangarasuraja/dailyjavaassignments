package dailytask;

import java.util.Scanner;

public class HappyNumber {
	
	public static int checkHappyNumber (int result)
	{
	int remainingValue = 0, sum = 0;
	// calculate the sum of squares of each digits
	while(result > 0)
	{
		remainingValue = result %10;
	sum = sum+(remainingValue*remainingValue);
	result = result/10;
	}
	return sum;
	}
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input a positive numeric value");
		
		int number = sc.nextInt();
		
		int result = number;
		
		while (result != 1 && result != 4)
		{
		result = checkHappyNumber(result);
		}
		if (result ==1)
		{
		System.out.println ("It is a Happy Number");
		}
		else
		{
		System.out.println (" It is not a Happy Number");
		}
		
		

	}

}
