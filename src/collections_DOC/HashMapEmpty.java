package collections_DOC;

import java.util.HashMap;

public class HashMapEmpty 
{
	public static void main(String args[])
	{
		HashMap<Integer, String> hosur = new HashMap<Integer, String>();
		
		System.out.println("Is Hash Map Empty ?!" +hosur.isEmpty());

		hosur.put(1, "Nike");
		hosur.put(2, "Adidas");
		hosur.put(3, "Jordan");
		hosur.put(4, "Reebok");
		hosur.put(5, "Power");
		hosur.put(6, "Lotto");
		hosur.put(7, "Bata");
		hosur.put(8, "Converse");
		hosur.put(9, "Stagg");
		
		System.out.println("Is Hash Map Empty ?!" +hosur.isEmpty());

		
		
	}

}
