package Lec48;

import java.util.*;

public class BellManFord {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFord(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1 se v2 ko connect kiya hai
	}

	public class EdgeList {
		int e1, e2, cost;

		public EdgeList(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;

		}

	}

	public List<EdgeList> Alledges() {
		List<EdgeList> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgeList(e1, e2, cost));
			}
		}
		return ll;
	}

	public void BellManFordAlgo() {
		List<EdgeList> list = Alledges();
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 10000000;
		}
		for (int i = 1; i <= v; i++) {

			for (EdgeList e : list) {
				if (i == v && (dis[e.e2] > dis[e.e1] + e.cost)) {
					System.out.println("-ve Weight ka cycle hai");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.println(i + " " + dis[i]);
		}
	}

	public static void main(String[] args) {
		BellManFord bfd = new BellManFord(5);
		bfd.AddEdge(1, 2, 8);
		bfd.AddEdge(2, 5, -2);
		// bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, 2);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		bfd.BellManFordAlgo();
	}

}
