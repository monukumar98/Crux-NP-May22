package Lec51;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(pathsum(grid, 0, 0));
	}

	public static int pathsum(int[][] grid, int cr, int cc) {
		if (cr >= grid.length || cc >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr==grid.length-1 && cc==grid[0].length-1) {
			return grid[cr][cc];
		}

		int v = pathsum(grid, cr + 1, cc);
		int h = pathsum(grid, cr, cc + 1);
		return Math.min(v, h) + grid[cr][cc];
	}

}
