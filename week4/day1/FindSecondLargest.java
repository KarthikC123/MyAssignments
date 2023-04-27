package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		int l=data.length;
		Set<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<l;i++)
		{
			ts.add(data[i]);
		}
		List<Integer> ls=new ArrayList<Integer>(ts);
		int s=ls.size();
		System.out.println("Second largest element in the list is " + ls.get(s-2));
		
	}

}
