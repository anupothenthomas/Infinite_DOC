package collections_DOC;

import java.util.ArrayList;

public class ArrayListClear {
	public static void main(String args[])throws InterruptedException
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("John");
		al.add("Ron");
		al.add("Remo");

		
		System.out.println("arraylist : " + al);
		
		Thread.sleep(750);
		al.clear();
		System.out.println("arraylist : " + al);

		
	}
	

}
