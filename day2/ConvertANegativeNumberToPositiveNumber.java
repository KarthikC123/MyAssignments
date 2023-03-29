package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
	int num=-15;
	int value=0;
	if (num<0)
	{
		value = num*-1;
		System.out.println("The number " +num+ " is converted to " +value);
	}
	else
	{
		System.out.println("The number " +num+ " is a positive number");
	}
	}

}
