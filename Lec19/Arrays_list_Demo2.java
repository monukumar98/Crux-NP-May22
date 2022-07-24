package Lec19;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_list_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		// add method
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(-20);
		System.out.println(list);
		// Update
		list.set(2, -90);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");

		}
		System.out.println();
		System.out.println("***********");
		for (int v : list) {
			System.out.print(v + " ");

		}

	}

}
