package Lec47;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Bipartite {
	class Solution {
		public boolean isBipartite(int[][] graph) {
			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
			for (int i = 0; i < graph.length; i++) {
				map.put(i, new HashMap<>());
			}
			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph[i].length; j++) {
					map.get(i).put(graph[i][j], 1);
				}
			}

			return isbipartite(map);

		}

		public class BipartitePair {

			int vtx;
			int lv;

			public BipartitePair(int vtx, int lv) {
				// TODO Auto-generated constructor stub
				this.vtx = vtx;
				this.lv = lv;
			}

		}

		public boolean isbipartite(HashMap<Integer, HashMap<Integer, Integer>> map) {

			Queue<BipartitePair> qq = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();

			for (int src : map.keySet()) {
				if (visited.containsKey(src)) {
					continue;
				}
				qq.add(new BipartitePair(src, 0));
				while (!qq.isEmpty()) {
					// remove
					BipartitePair rv = qq.poll();
					// Ignore if Already visited
					if (visited.containsKey(rv.vtx)) {
						if (visited.get(rv.vtx) != rv.lv) {
							return false;
						}

					}

					// mark visited
					visited.put(rv.vtx, rv.lv);
					// add nbrs
					for (int nbrs : map.get(rv.vtx).keySet()) {
						if (!visited.containsKey(nbrs)) {
							qq.add(new BipartitePair(nbrs, rv.lv + 1));
						}
					}

				}
			}
			return true;
		}

	}
}
