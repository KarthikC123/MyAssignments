package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String input="changeme";
		char[] c=input.toCharArray();
		int l=c.length;
		String uc="";
		for(int i=0;i<=l-1;i++)
		{
			if(i%2!=0)
			{
				//char u=Character.toUpperCase(c[i]);
				//System.out.println(u);
				uc=uc+(Character.toUpperCase(c[i]));
			}
			else
			{
				//System.out.println(c[i]);
				uc=uc+c[i];
			}
		}
		
		System.out.println("Converted string is " + " " +uc.toString());
		
	}

}
