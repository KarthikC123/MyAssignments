package week1.day2;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 
	 * 1) 1st and 2nd numbers can be printed before the loop
	 * 2) The remaining numbers in the sequence can be printed by looping till the range value mentioned
	 * 3) After adding 1st and 2nd numbers, the sum needs to be assigned to 2nd number and 2nd number needs to be assigned to 1st number.
	 * 
	 */
	public static void main(String[] args) {
		int range =10;
		int firstNum=0;
		int secNum=1;
		int sum=0;
	System.out.println(firstNum +"\n"+ secNum);
	for(int i=3;i<=range;i++)
	{
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
	System.out.println(sum);
	}
		}

			}
