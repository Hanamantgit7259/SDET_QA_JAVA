package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B_ArrayList_Homogeneous {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		// add, insert,modify, get,AllPrint,Remove one,SPecific, All, Size, isEmPty();

		// Add
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println("Size : " + list.size());
		System.out.println("Printing SPecific element : " + list.get(3));

		System.out.println("Printing All After Adding" + list);

		// Insert
		list.add(2, 22);
		System.out.println("Printing After Inserting" + list);

		System.out.println("Size : " + list.size());
		
		
		// Modify
		list.add(3, 33);
		System.out.println("Printing After Modifying" + list);
		System.out.println("Size : " + list.size());

		// Reading one by one
		// For while
		System.out.println("For Loo");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}

		System.out.println("For each Loop");
		for (int x : list) {
			System.out.print(x + " ");
		}

		// Iterator
		System.out.println("Iteratior printing ");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Removing one Element ");
		list.remove(3);
		System.out.println("printing after removing one element ");
		
		System.out.println("Removing Few Selected Elements ");
        ArrayList list2 = new ArrayList();
		list2.add(33);
		list.removeAll(list2);
		System.out.println("Printing After Removing Few Selected Elements ");
		
		System.out.println("Size : " + list.size());
		
		list.clear();
		System.out.println("Removed All the Elements : " + list);
		
		System.out.println("Size : " + list.size());
		
		
		
	}

}
