package week3.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		int l1=arr1.length;
		int l2=arr2.length;
		for(int i=0;i<l1;i++)
		{
		for(int j=0;j<l2;j++)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.print(arr1[i]+" ");
			}
		}	
		}	

	}

}
