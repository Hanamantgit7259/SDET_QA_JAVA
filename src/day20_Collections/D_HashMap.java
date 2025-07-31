package day20_Collections;

import java.util.HashMap;
import java.util.Map;

public class D_HashMap {

	public static void main(String[] args) {

		//can store all types of key
		Map mp = new HashMap();
		mp.put(1, "Hello");
		mp.put("2", 2);
		mp.put(2, 3);

		Map<Integer, String> mp1 = new HashMap<Integer,String>();
		
		mp1.put(1, "Virat");
		mp1.put(2, "LaxmiSree");
		mp1.put(3, "Nihal");
		
		mp1.put(4, "ViratReddy");
		mp1.put(5, "LaxmiSreeReddy");
		mp1.put(6, "NihalReddy");
		
		System.out.println("Size of An HashMap : " + mp1.size());
		 mp1.remove(3);
		
		System.out.println("After Removing " + mp1 );
		
		System.out.println("Accessing the Value of the key : " + mp1.get(5));
		
		//All the Keys from the Hashmap
		System.out.println(mp1.keySet());
		
		//All the Values from the HashMap
		System.out.println(mp1.values());
		
		//Key + value
		System.out.println(mp1.entrySet());
		
		//updating the values:
		mp1.put(2, "UpdatedVirat");
		 System.out.println("After Updating ");
		 System.out.println(mp1);
		 
		// Reading data from hashMap
		 
		 for(int k:mp1.keySet()) {
			 System.out.println(k+ " " + mp1.get(k));
		 }
		
	}

}
