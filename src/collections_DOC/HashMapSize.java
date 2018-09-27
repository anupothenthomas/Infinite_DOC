package collections_DOC;

import java.util.HashMap;

public class HashMapSize 
{
	public static void main(String args[])
	{
		
	HashMap<Integer, String> shoeportal = new HashMap<Integer, String>();
	
	shoeportal.put(1, "Nike");
	shoeportal.put(2, "Adidas");
	shoeportal.put(3, "Jordan");
	shoeportal.put(4, "Reebok");
	shoeportal.put(5, "Sparx");
	
	
	System.out.println("The number of shoes inside the shop is " +shoeportal.size());

	
	}
}
