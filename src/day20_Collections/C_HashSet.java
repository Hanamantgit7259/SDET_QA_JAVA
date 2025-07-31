package day20_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C_HashSet {

	public static void main(String[] args) {

		// HashSet hs = new HashSet();

		// Set<String> st = new HashSet<String>();

		Set set = new HashSet();

		// Adding Data
		set.add("Virat");
		set.add(1);
		set.add('A'); 
		set.add(10.5);
		set.add(true);

		// Remove a Specific Element
		System.out.println("Before Removing " + set);
		set.remove('A');
		System.out.println("After Removing " + set);

		// Read a Specific data: Not Possible
		// Read by Converting Set to ArrayList

		ArrayList al = new ArrayList(set);
		al.remove(3);
		System.out.println("Removing the element : " + al);

		// Reading all the HashSet Elements
		// Normal For Loop Not Possible
		// For Each is Possible
		System.out.println("Printing All the elements using For each");
		for (Object x : set) {
			System.out.println(x);
		}

		// Iterator
		Iterator it = set.iterator();
		System.out.println("Printing using iterator ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Size of An Element : " + set.size());

		set.clear();
		System.out.println("After clearing : " + set);
		System.out.println("Size of An Element After clearing : " + set.size());
	}

}
