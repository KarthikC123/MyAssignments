package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="PayPal India";
		char[] ch=s.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		int l=ch.length;
		for(int i=0;i<l;i++)
		{
			if(!charSet.add(ch[i]))
			{
				dupCharSet.add(ch[i]);
			}
		}
		charSet.removeAll(dupCharSet);
		List<Character> ls=new ArrayList<Character>(charSet);
		int len=ls.size();
		for(int i=0;i<len;i++)
		{
			if(ls.get(i)!=' ')
			{
				System.out.print(ls.get(i));
			}
		}

	}

}
