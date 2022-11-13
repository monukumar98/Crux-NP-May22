package Lec47;

import java.util.*;

public class Graph_2 {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void BFT() {
		Queue<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int rv = qq.poll();
				// Ignore if Already visited
				if (visited.contains(rv)) {
					continue;

				}
				// self work
				System.out.print(rv + " ");
				// mark visited
				visited.add(rv);
				// add nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
		}
		System.out.println();
	}

	public void DFT() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

			s.push(src);
			while (!s.isEmpty()) {
				// remove
				int rv = s.pop();
				// Ignore if Already visited
				if (visited.contains(rv)) {
					continue;

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
		System.out.println();

	}

	public int CountConnected() {
		Queue<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int rv = qq.poll();
				// Ignore if Already visited
				if (visited.contains(rv)) {
					continue;

				}

				// mark visited
				visited.add(rv);
				// add nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
		}
		return count;
	}

}
