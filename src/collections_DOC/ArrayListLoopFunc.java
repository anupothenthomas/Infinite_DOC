package collections_DOC;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoopFunc 
{
	public static void main(String args[])
	{
		ArrayList<String> arlist = new ArrayList<String>();
		
		arlist.add("remo");
		arlist.add("demo");
		arlist.add("nemo");
		System.out.println("ArrayList using for loop");

		for(int count = 0; count<arlist.size(); count++)
		{
			System.out.println(count);
		}
		
		System.out.println("ArrayList using advanced for loop");

		for(String name : arlist)
		{
			System.out.println(name);
		}
		
		System.out.println("ArrayList using while loop");

		int count =0; 
		while (arlist.size()>count)
		{
			System.out.println(arlist.get(count));
			count++;
		}
		System.out.println("ArrayList using iterator");
		
		Iterator iterator = arlist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
