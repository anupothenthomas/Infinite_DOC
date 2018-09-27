package collections_DOC;

import java.util.HashMap;

public class HashMapClear 
{
	public static void main(String args[])
	{

		HashMap<Integer, String> shoeportal = new HashMap<Integer, String>();
		
		shoeportal.put(1, "Nike");
		shoeportal.put(2, "Adidas");
		shoeportal.put(3, "Jordan");
		shoeportal.put(4, "Reebok");
		shoeportal.put(5, "Power");
		shoeportal.put(6, "Lotto");
		shoeportal.put(7, "Bata");
		shoeportal.put(8, "Converse");
		shoeportal.put(9, "Stagg");
		
		System.out.println("The hashmap before clearing off the mapping " +shoeportal);

		shoeportal.clear();
		
		System.out.println("The hashmap after clearing off the mapping " +shoeportal);
	}

}
