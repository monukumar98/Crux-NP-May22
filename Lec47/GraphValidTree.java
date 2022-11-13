package Lec47;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class GraphValidTree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new HashMap<>());
			}
			for (int[] a : edges) {
				int v1 = a[0];
				int v2 = a[1];
				map.get(v1).put(v2, 2);
				map.get(v2).put(v1, 2);
			}
			return isTree(map);

		}

		public boolean isTree(HashMap<Integer, HashMap<Integer, Integer>> map) {

			Stack<Integer> s = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int count = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				count++;
				s.push(src);
				while (!s.isEmpty()) {
					// remove
					int rv = s.pop();
					// Ignore if Already visited
					if (visited.contains(rv)) {
						return false;// cycle hai

					}
					// self work
					System.out.print(rv + " ");
					// mark visited
					visited.add(rv);
					// add nbrs
					for (int nbrs : map.get(rv).keySet()) {
						if (!visited.contains(nbrs)) {
							s.push(nbrs);
						}
					}

				}

			}
			return count == 1;

		}
	}

}
