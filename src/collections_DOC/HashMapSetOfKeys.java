package collections_DOC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSetOfKeys 
{
	public static void main(String[] args)
	{
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		hmap.put("Key1", "Nike");
		hmap.put("Key2", "Adidas");
		hmap.put("Key3", "Jordan");
		hmap.put("Key4", "Reebok");
		hmap.put("Key5", "Power");
		hmap.put("Key6", "Lotto");
		hmap.put("Key7", "Bata");
		hmap.put("Key8", "Converse");
		hmap.put("Key9", "Stagg");
		
		
		Set<String> keys = hmap.keySet();
		System.out.println("Set of Keys");
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
