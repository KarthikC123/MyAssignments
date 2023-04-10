package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public void automation()
	{
		System.out.println("Automating the interfaces and abstract classes");
	}
	public void java()
	{
		System.out.println("Learning the language Java");
	}
	public void selenium()
	{
		System.out.println("Using Selenium tool for automation testing");
	}
	public void ruby()
	{
		System.out.println("Ruby language can be used with Selenium");
	}
	public static void main(String[] args) {
		Automation a=new Automation();
		a.automation();
		a.java();
		a.selenium();
		a.python();
		a.ruby();
		
}

}
