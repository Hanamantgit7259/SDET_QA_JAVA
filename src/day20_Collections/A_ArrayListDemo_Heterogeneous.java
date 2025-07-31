package day20_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A_ArrayListDemo_Heterogeneous {

	public static void main(String[] args) {

		// add, remove,Insert, Replace, access specified, reading methods
		// Storing
		ArrayList myList = new ArrayList();
		// List list = new ArrayList();

		// adding
		myList.add(1);
		myList.add(2l);
		myList.add(2.0);
		myList.add("Virat");
		myList.add('A');
		myList.add(true);

		// Printing all the added data

		System.out.println("Printing All The Added Data : " + myList);
		System.out.println("Size of the ArrayList : " + myList.size());
		System.out.println("Printing the 4th index data " + myList.get(4));

		System.out.println("Before Removing the data : " + myList);
		myList.remove(3);
		System.out.println("After Removing the data : " + myList);

		System.out.println("Before Inserting the data : " + myList);
		myList.add(5, false);

		System.out.println("After Inserting the data : " + myList);

		System.out.println("Printing using For Loop");

		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

		System.out.println("Printing using For Each Loop");

		for (Object x : myList) {
			System.out.println(x);
		}

		System.out.println("Printing Iterator ");

		Iterator it = myList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// Removing Secific elements

		ArrayList myList2 = new ArrayList();
		myList2.add(1);
		myList2.add('A');
		myList.removeAll(myList2);

		System.out.println(myList.size());
		System.out.println("After Removing Specific Element : " + myList);
		System.out.println(myList.size());

		myList.clear();
		System.out.println("After Removing All Element : " + myList);
		System.out.println(myList.size());

	}

}
