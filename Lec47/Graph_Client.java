package Lec47;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_2 g = new Graph_2(7);
		g.AddEdge(1, 3, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		
		g.BFT();
		g.DFT();
		System.out.println(g.CountConnected());

	}

}
