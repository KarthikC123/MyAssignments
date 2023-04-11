package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	int count=0;
    String[] s =text.split(" ");
    int l=s.length;
    String dup="";
    String rmv="";
for (int i=0;i<=l-1;i++)
{
for(int j=i+1;j<l-1;j++)
		{
	if(s[i].equalsIgnoreCase(s[j]))
			{
		count++;
		dup=s[j];
			}
	
		}
}

if(count>0)
{
	rmv=text.replaceAll(dup,"");
}
else
{
rmv=text;
}

System.out.println("The string without duplicate words is:"  +" " + rmv);
}

}
