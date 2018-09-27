package collections_DOC;

import java.util.HashMap;

public class HashMapCopyToAnother 
{
	public static void main(String[] args)
	{
		 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 
	     //add elements to HashMap
	     hmap.put(1, "AA");
	     hmap.put(2, "BB");
	     hmap.put(3, "CC");
	     hmap.put(4, "DD");
	 
	     // Create another HashMap
	     HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
	 
	     // Adding elements to the recently created HashMap
	     hmap2.put(11, "Hello");
	     hmap2.put(22, "Hi");
	 
	     
	     hmap2.putAll(hmap);
	     
	     System.out.println(hmap2);
	}

}
