package com.prog.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProg {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("Ram");
		ll.add("Ramesh");

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
