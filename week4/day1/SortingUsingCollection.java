package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] s = {"Wipro","HCL","CTS","Aspire Systems"};
		int len=s.length;
		List<String> l=new ArrayList<String>();
		for(int i=0;i<len;i++)
		{
			l.add(s[i]);
		}
Collections.sort(l);
for(int i=l.size()-1;i>=0;i--)
{
	if(i!=0)
	{
		System.out.print(l.get(i) + "," + " ");
	}
	else {
		System.out.print(l.get(i));
	}
	}
		
	}

}
