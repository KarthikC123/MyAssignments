package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] num= {1,4,3,3,2,5,8,7,9,10};
		Set<Integer> st=new TreeSet<Integer>();
		int l=num.length;
		for(int i=0;i<l;i++)
		{
			st.add(num[i]);
		}
		List<Integer> ls=new ArrayList<Integer>(st);
		int s=ls.size();
		for(int i=0;i<s;i++)
		{
			if(ls.get(i)!=(i+1))
			{
				System.out.println("Missing number is " + (i+1));
				break;
			}
		}
		
		

	}

}
