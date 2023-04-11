package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int l1=text1.length();
		int l2=text2.length();
		if(l1==l2)
		{
			char[] c1=text1.toCharArray();
			char[] c2=text2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			Boolean b=Arrays.equals(c1, c2);
			if(b==true)
			{
				System.out.println("The provided strings " + " " +text1 + " and " +text2 + " are anagrams");
			}
			else {
				System.out.println("The provided strings " + " " +text1 + " and " +text2 + " are not anagrams");
			}
			
			}
		else {
			System.out.println("The provided strings " + " " +text1 + " and " +text2 + " are not anagrams");
		}
		

	}

}
