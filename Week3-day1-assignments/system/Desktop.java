package system;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("The desktop size is 15 inches");
	}

	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
		
}

}
