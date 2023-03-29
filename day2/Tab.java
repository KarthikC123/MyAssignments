package week1.day2;

public class Tab {
	public int tabPrice(int tabPrice)
	{
		return tabPrice;
	}
    public String tabBrand(String brandName)
    {
    	return brandName;
    }
	public static void main(String[] args) {
		Tab tb =  new Tab();
		int tp = tb.tabPrice(10000);
		String bn = tb.tabBrand("Apple");
		System.out.println("Tab price is " +tp);
		System.out.println("Brand name is " +bn);
	}

}
