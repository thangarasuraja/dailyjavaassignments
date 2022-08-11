package dailytask;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get the square root");
		Double number=sc.nextDouble();
		
		Double squreRoot=Math.sqrt(number);
		
		System.out.println("The square root of given number is :" + squreRoot);
	}

}
