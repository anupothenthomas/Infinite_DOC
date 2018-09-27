package collections_DOC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortByKey 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(4, "d");
		hmap.put(5, "e");
		hmap.put(1, "a");
		hmap.put(2, "b");
		hmap.put(6, "f");
		hmap.put(3, "c");
		
		
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry mpent = (Map.Entry)iterator.next();
			System.out.println("The key is" + mpent.getKey()+ "the value is " +mpent.getValue());
		}
		
		
		Map<Integer, String> maps = new TreeMap<Integer, String>(hmap);
		System.out.println("\n\nAfter Sorting:\n\n");
		
		
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		
		while(iterator2.hasNext())
		{
			Map.Entry ment = (Map.Entry)iterator2.next();
			System.out.println("The key is" + ment.getKey()+ "the value is " +ment.getValue());
		}
		

	}

}
