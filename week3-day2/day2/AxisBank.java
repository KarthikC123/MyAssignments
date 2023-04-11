package week3.day2;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Axis bank provides cash deposit facility for customers");
	}

	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();
	}

}
