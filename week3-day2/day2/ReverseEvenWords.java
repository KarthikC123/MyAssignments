package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String input="I am a software tester";
		String[] s=input.split(" ");
		int l=s.length;
		for(int i=0;i<=l-1;i++)
		{
			if(i%2!=0)
			{
				char[] c =s[i].toCharArray();
				for(int j=c.length-1;j>=0;j--)
				{
					System.out.print(c[j]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(s[i] + " ");
			}
		}

	}

}
