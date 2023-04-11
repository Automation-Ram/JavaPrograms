package com.prog.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceProg {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(1, "QA");
		map.put(2, "Automation");

		Set s = map.entrySet();

		Iterator it = s.iterator();

		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
