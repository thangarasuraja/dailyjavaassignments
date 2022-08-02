package dailytask;

public class LengthOfLastWord {

	public static void main(String[] args) {
		//Declare a string
		String sentence="The way to get started is to quit talking and begin doing";

		//split the string 
		String [] array=sentence.split(" ");
		//Iterate the string array to found the last word
		for (int i = 0; i < array.length; i++) {
			if(i==array.length-1) {
				String lastword=array[i];
				char[] charArray = lastword.toCharArray();
				int lastwordlength= charArray.length;
				System.out.println("The last word is "+lastword+" with length "+lastwordlength);
			}
		}
	}
}
