package oops_EXTRAS_DOC;

class Tester
{
	private class Test
	{
		public void print()
		{
		System.out.println("He is private class");
		}
	}
	
	void display_Inner()
	{
		Test obj = new Test();
		obj.print();
	}
}



public class PrivateInnerClass {

	public static void main(String[] args) 
	{
		Tester haha = new Tester();
		
		haha.display_Inner();
		// TODO Auto-generated method stub

	}

}
