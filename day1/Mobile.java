package week1.day1;

public class Mobile 
    {
public void makeCall()
          {
       		String mobileModel = "Samsung S22";
    		float mobileWeight=1.56f;
    		System.out.println("Mobile model is " + mobileModel);
    		System.out.println("Mobile weight is " + mobileWeight);
          }
public void sendMsg()
{
	boolean isFullCharged = true;
	int mobileCost = 5000;
	System.out.println("Mobile is fully charged is " + isFullCharged);
	System.out.println("Cost of the mobile is " + mobileCost);
}
public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
    }

}


