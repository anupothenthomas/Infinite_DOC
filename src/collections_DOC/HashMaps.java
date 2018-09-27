package collections_DOC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps 
{
	public static void main(String[] args)

	{
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(10, "Anu");
		hmap.put(11, "Pothen");
		hmap.put(12, "Thomas");
		
		
		/*----------- GET VALUES BASED ON VALUE---------*/
		
		Set set = hmap.entrySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry mpentry = (Map.Entry)iterator.next();
			System.out.println("the Key is " + mpentry.getKey() + "and the value is " + mpentry.getValue());
			
			/*--------GET VALUES BASED ON KEY -------*/
			
			String var = hmap.get(10);
			System.out.println("The value of the key is " + var) ;
			
			
			
			/*--------REMOVE VALUES BASED ON KEY---------*/
			
			hmap.remove(11);
			System.out.println("The map keys and values after removal are as follows: ");
			
			
			/*--------FOR LOOP--------*/
//			for(Map.Entry me: hmap.entrySet())
//			{
//				System.out.println("the key is" +me.getKey() + "and the value is " +me.getValue());
//			}
			
			/*--------WHILE LOOP--------*/

			Set set2 = hmap.entrySet();
			Iterator iterator2 = set2.iterator();
			
			while(iterator2.hasNext())
			{
			Map.Entry mentry = (Map.Entry)iterator2.next();
			System.out.println("The key is " +mentry.getKey() + "and the value is " +mentry.getValue()) ;
			
			
			
			}
			
			
			
			
		}
		
		
	}
}
