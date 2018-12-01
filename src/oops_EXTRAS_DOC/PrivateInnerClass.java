package oops_EXTRAS_DOC;

class Test
{
	private class Testin
	{
		public void print()
		{
		System.out.println("He is private class");
		}
	}
	
	void display_Inner()
	{
		Testin obj = new Testin();
		obj.print();
	}
}



public class PrivateInnerClass {

	public static void main(String[] args) 
	{
		Test haha = new Test();
		
		haha.display_Inner();
		// TODO Auto-generated method stub

	}

}
