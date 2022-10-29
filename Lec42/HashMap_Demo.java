package Lec42;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 87);
		map.put("Aman", 89);
		map.put("Kunal", 77);
		map.put("Amit", 56);
		map.put("Pooja", 68);
		map.put("Shivam", 68);
		map.put("Mohan", 48);
		map.put("Amisha", 98);
		// map.put(null, 7);
		System.out.println(map);
		//<String> key = map.keySet();
		for (String s : map.keySet()) {
			System.out.println(s + " " + map.get(s));
		}
		ArrayList<String> list = new ArrayList<>( map.keySet());

//		// get
//		System.out.println(map.get("Rajesh"));
//		System.out.println(map.get("Raj"));
//		// contains
//		System.out.println(map.containsKey("Ankit"));
//		System.out.println(map.containsKey("Raj"));
//		// remove
//		System.out.println(map.remove("Ankita"));
//		System.out.println(map.remove("Raj"));
//		System.out.println(map);

		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Raj", 87);
		map1.put("Aman", 89);
		map1.put("Kunal", 77);
		map1.put("Amit", 56);
		map1.put("Pooja", 68);
		map1.put("Shivam", 68);
		map1.put("Mohan", 48);
		map1.put("Amisha", 98);
		// System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Raj", 87);
		map2.put("Aman", 89);
		map2.put("Kunal", 77);
		map2.put("Amit", 56);
		map2.put("Pooja", 68);
		map2.put("Shivam", 68);
		map2.put("Mohan", 48);
		map2.put("Amisha", 98);
		// map2.put(null, 89);
		// System.out.println(map2);

	}

}
