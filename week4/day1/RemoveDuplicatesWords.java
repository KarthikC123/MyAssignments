package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] split=text.split(" ");
	Set<String> st=new LinkedHashSet<String>();
	int l=split.length;
	for(int i=0;i<l;i++)
	{
		st.add(split[i]);
	}
	List<String> ls=new ArrayList<String>(st);
	int len=ls.size();
	for(int i=0;i<len;i++)
	{
		System.out.print(ls.get(i) + " ");
	}
	

	}

}
