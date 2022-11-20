package Lec48;

import java.util.*;

public class Prim_Algorithm {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prim_Algorithm(int v) {
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

	public class PrimsPair {

		int vtx;
		int acqv;
		int cost;

		public PrimsPair(int vtx, int acqv, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqv = acqv;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acqv + " @ " + this.cost;
		}

	}

	public void PrimsAlgo() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			PrimsPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			System.out.println(rp);
			visited.add(rp.vtx);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}

			}
		}

	}

	public static void main(String[] args) {
		Prim_Algorithm pa = new Prim_Algorithm(7);
		pa.AddEdge(1, 2, 9);
		pa.AddEdge(1, 3, 2);
		pa.AddEdge(3, 4, 3);
		pa.AddEdge(4, 2, 2);
		pa.AddEdge(3, 5, 4);
		pa.AddEdge(5, 6, 1);
		pa.AddEdge(5, 7, 7);
		pa.AddEdge(6, 7, 2);
		pa.PrimsAlgo();
	}

}
