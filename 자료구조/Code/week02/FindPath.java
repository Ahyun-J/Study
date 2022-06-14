package week02;

public class FindPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		0000 = no path
//		1000 = can go left
//		100 = can go right
//		10 = can go up
//		1 = can go down

		int[][] map1 = { { 0, 100, 0 }, { 100, 10, 0 }, { 10, 0, 0 } };
		int[][] map2 = { { 0, 1000, 0 }, { 100, 10, 0 }, { 10, 0, 0 } };

		int nROW = 3;
		int nCOL = 3;

		int startY = 2, startX = 0;
		int finishY = 0, finishX = 2;

		if (findPath(map1, startX, startY, finishX, finishY) == true) {
			System.out.println("map1: Found a path!");
		} else
			System.out.println("map1: There is no path!");

		if (findPath(map2, startX, startY, finishX, finishY) == true) {
			System.out.println("map2: Found a path!");
		} else
			System.out.println("map2: There is no path!");

	}

	public static boolean findPath(int[][] m, int x, int y, int X, int Y) {

		if (x == X && y == Y) {
			return true;
		} else if (m[y][x] == 1) {
			return findPath(m, x, y + 1, X, Y);
		} else if (m[y][x] == 10) {
			return findPath(m, x, y - 1, X, Y);
		} else if (m[y][x] == 100) {
			return findPath(m, x + 1, y, X, Y);
		} else if (m[y][x] == 1000) {
			return findPath(m, x - 1, y, X, Y);
		} else {
			return false;
		}
	}
}

