package week1.day2;

public class PrimeNumber {
/*
		 * Goal: To find whether a number is a Prime number or not
		 * 
		 * input: 13
		 * output: 13 is a Prime Number
		 * 
		 * Shortcuts:
		 * 1) Print : type: syso, followed by: ctrl + space + enter
		 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
		 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
		 *   
		 * What are my learnings from this code?
		 * 1)Any number that is divisible by numbers other than the number and 1 is non-prime and the logic can be implemented by looping from 2 to half of thenumber. 
		 * 2)Once the remainder becomes zero,it means the number is not prime and program flow can break out of the loop.
		 * 3)Conditions and loops can be used together and inside each other 
		 * 
		 */
	public static void main(String[] args) {
		int input =27;
		boolean flag = false;
		int rem =0;
		for (int i=2;i<=input/2;i++)
		{
			rem=input%i;
			if(rem==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("The given number " +input+ " is not prime");
		}
		else {
			System.out.println("The given number " +input+ " is prime");
		}
		

	}

}
