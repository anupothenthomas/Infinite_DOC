package collections_DOC;

import java.util.ArrayList;

public class ArrayListCloning
{
	public static void main(String args[]) throws InterruptedException
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("John");
		al.add("Ron");
		al.add("Remo");
		
		System.out.println("arraylist : " +al);

		Thread.sleep(750);
//		ArrayList<String> cloned = (ArrayList<String>)arlist.clone();
		
	     ArrayList<String> al2 = (ArrayList<String>)al.clone();

		System.out.println("Cloned arraylist : " +al2);
		
		
		
		
		
	}

}
