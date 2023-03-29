package week1.day2;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		int input=4;
		for (int i=1;i<=input;i++)
		{
			fact=fact*i;
		}
	   System.out.println("Factorial of the given number is " +fact);
	}

}
