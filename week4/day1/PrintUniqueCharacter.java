package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String input="karthik";
		char[] ch=input.toCharArray();
		Set<Character> s=new LinkedHashSet<Character>();
		Set<Character> ds=new LinkedHashSet<Character>();
		int lt=ch.length;
		for(int i=0;i<lt;i++)
		{
			if(!s.add(ch[i]))
			{
			ds.add(ch[i]);	
			}
			}
		
		s.removeAll(ds);
		
		/*for(Character character : s)
		{
			System.out.print(character);
		}*/
		
		List<Character> l=new ArrayList<Character>(s);
		int len=l.size();
		for(int i=0;i<len;i++)
		{
			System.out.print(l.get(i) + " ");
		}
	}

}
