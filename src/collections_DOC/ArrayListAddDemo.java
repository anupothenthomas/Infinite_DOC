package collections_DOC;

import java.util.ArrayList;

public class ArrayListAddDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		
		arlist.add(1);
		arlist.add(2);
		arlist.add(3);
		arlist.add(4);
		arlist.add(5);
		arlist.add(6);
		
		System.out.println(arlist);
		
		arlist.remove(3);
		System.out.println(arlist);
		
	}

}
