package week3.day2;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student id is " + id);
		
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student id and name is " +id+ " and " +name);
	}
	public void getStudentInfo(String email,long phno)
	{
		System.out.println("Student email and phone no is " +email+ " and " +phno);
	}
	public static void main(String[] args) {
		int id =12345;
		String nm="Karthik";
		String em="learning@testleaf.com";
		long ph=9999999999l;
		Students st=new Students();
		st.getStudentInfo(id);
		st.getStudentInfo(id, em);
		st.getStudentInfo(em, ph);
		
}

}
