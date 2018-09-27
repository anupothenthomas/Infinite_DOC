package collections_DOC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoopThroughHashMap 
{
	public static void main(String args[])
	{
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(10, "Anu");
		hmap.put(11, "Pothen");
		hmap.put(12,  "Thomas");
		hmap.put(13, "Shalom");
		
		for(Map.Entry me : hmap.entrySet())
		{
			System.out.println("The Key is " +me.getKey()+ "The value is " +me.getValue());
			
		}
//		Set set = hmap.entrySet();
//		Iterator iterator = set.iterator();
//		
//		while(iterator.hasNext())
//		{
//			
//		Map.Entry entmap = (Map.Entry)iterator.next();
//		System.out.println("The Key is " +entmap.getKey()+ "The value is " +entmap.getValue());
//		
//		
//		
//		}
//		
		
		
	}

}
