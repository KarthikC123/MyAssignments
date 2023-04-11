package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String input="madam";
		char[] ch=input.toCharArray();
		String rev="";
		int l=ch.length;
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		if(input.equals(rev))
		{
			System.out.println("Input string is palindrome");
		}
		else {
			System.out.println("Input string is not palindrome");
		}
	}

}
