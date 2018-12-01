package collections_DOC;

import java.util.HashMap;

public class HashMapContainsKey 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(1, "Anu");
		hashmap.put(2, "Cat");
		hashmap.put(3, "John");
		hashmap.put(4, "Helo");	
		

		
		
		 boolean flag = hashmap.containsKey(2);
		    System.out.println("Key 2 exists in HashMap? : " + flag);
		    
		    boolean fla = hashmap.containsKey(9);
		    System.out.println("Key 2 exists in HashMap? : " + fla);
	}
	

}
