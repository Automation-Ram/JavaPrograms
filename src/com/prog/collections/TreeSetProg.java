package com.prog.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) {

		TreeSet tr = new TreeSet();

		tr.add("Ram");
		tr.add("Ashwin");

		Iterator it = tr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
