package dailytask;

import java.util.Scanner;

public class JavaChallenge3Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string to check polindrome or not");
		
		String sentence=sc.nextLine();
		String sentence2=sentence.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sentence2);
		String sentence3=sentence2.toLowerCase();
		System.out.println(sentence3);
		
		char[] charArray = sentence3.toCharArray();
		
		String reverseString="";
		
		for (int i = charArray.length-1; i >=0 ; i--) {
			
			reverseString=reverseString+charArray[i];
			
		}
		
		System.out.println(reverseString);
		
		if(reverseString.equals(sentence3)) {
			System.out.println("The Given string " + sentence3 +" is a polindrome");
		}
		else {
			System.out.println(sentence3 +" is not a polindrome");
		}


	}

}
