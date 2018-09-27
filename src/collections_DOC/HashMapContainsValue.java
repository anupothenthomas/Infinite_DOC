package collections_DOC;

import java.util.HashMap;

public class HashMapContainsValue 
{
	public static void main(String args[])
	{
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "Anu");
		hmap.put(2, "Cat");
		hmap.put(3, "John");
		hmap.put(4, "Helo");
		hmap.put(5, "Blob");
		
		hmap.containsKey(3);
		
		Boolean flag = hmap.containsKey(7);
		System.out.println("Contains Value?! " +flag);
		
		Boolean flags = hmap.containsKey(2);
		System.out.println("Contains Value?! " +flags);
		
	}

}
