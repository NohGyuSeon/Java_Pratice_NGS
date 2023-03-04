package NGS.NHN.code.day03;

import java.util.Random;

public class Maze {
	static int size = 10;
	static int visited = 2;
	static int cannot = 3;
	
	public static boolean findPath(int[][]maze, int x, int y) {
		if (x < 0 || y < 0 || x >= size || y >= size) {
			return false;
		} else if (maze[x][y] != 0) {
			return false;
		} else if (x == size-1 && y == size-1) {
			maze[x][y] = visited;
			return true;
		} else {
			maze[x][y] = visited;
			if (findPath(maze, x-1, y) || findPath(maze, x, y-1) || findPath(maze, x+1, y) || findPath(maze, x, y+1)) {
				return true;
			} else {
				maze[x][y] = cannot;
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[][]maze = new int[10][10];
		
		Random rand = new Random();
		
		int doorCount = rand.nextInt(50);
		int index = doorCount;
		System.out.println(index);
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				maze[i][j] = 0;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				int percent = rand.nextInt(100);
				if (percent > 50) {
					if (index == 0) {
						break;
					}
					if (maze[i][j] == 0) {
						maze[i][j] = 1;
						index--;
						count++;
					} else {
						continue;
					}
				}
			}
		}
		
		System.out.println(count);
		System.out.println("생성된 판의 형태를 출력합니다.");
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(findPath(maze, 0, 0));
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
