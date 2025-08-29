package BaekJoon.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P16236 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] space = new int[n][n];
		int[][] visited = null;
		Coordinate start = null;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				space[i][j] = Integer.parseInt(st.nextToken());
				if (space[i][j] == 9) {
					start = new Coordinate(0,i,j);
					space[i][j] = 0;
				}
			}
		}
		PriorityQueue<Coordinate> queue = new PriorityQueue<>();
		int ans = 0;
		int levelCount = 0;
		for(int i=2;true;) {
			visited = new int[n][n];
			for(int[]a:visited)Arrays.fill(a,Integer.MAX_VALUE);
			queue.add(start);
			sol(queue, space, visited, i);
			// for(int x=0;x<n;x++) for(int y=0;y<n;y++) System.out.print(visited[x][y][i] + (y == n-1 ? "\n" : " "));

			Coordinate next = getClosest(space, visited, i);
			if(next == null) break;
			ans += next.distance;
			levelCount++;
			// System.out.println(next + " level : " + i);
			if(i==levelCount) {
				i++;
				levelCount = 0;
			}
			space[next.x][next.y] = 0;
			start = next;
			start.distance = 0;
		}
		System.out.println(ans);
	}
	static class Coordinate implements Comparable<Coordinate> {
		int distance;
		int x;
		int y;
		public Coordinate(int distance, int x, int y) {
			this.distance = distance;
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Coordinate o) {
			if (this.distance == o.distance)
				if (this.x == o.x) return Integer.compare(this.y, o.y);
				else return Integer.compare(this.x, o.x);
			else return Integer.compare(this.distance, o.distance);
		}
		@Override
		public String toString() {
			return String.format("(distance : %d, x : %d, y : %d)", distance, x, y);
		}
	}
	static void sol(PriorityQueue<Coordinate> queue, int[][] space, int[][] visited, int level) {
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, -1, 0, 1};
		while (!queue.isEmpty()) {
			Coordinate curr = queue.poll();
			int distance = curr.distance;
			int x = curr.x;
			int y = curr.y;
			if (visited[x][y] < distance) continue;
			visited[x][y] = distance;
			distance++;
			for (int i =0 ; i < 4; i++) {
				int nextX = x + dx[i];
				int nextY = y + dy[i];
				if (nextX < 0 || nextX >= space.length || nextY < 0 || nextY >= space[0].length) continue;
				if (space[nextX][nextY] > level) continue;
				if (visited[nextX][nextY] > distance) {
					visited[nextX][nextY] = distance;
					queue.add(new Coordinate(distance, nextX, nextY));
				}
			}
		}
	}
	static Coordinate getClosest(int[][] space, int[][] visited, int level) {
		Coordinate closest = null;
		for (int i = 0 ; i < space.length ; i++) {
			for (int j = 0 ; j < space[i].length ; j++) {
				if (space[i][j] != 0 && space[i][j] < level && visited[i][j] != Integer.MAX_VALUE) {
					if (closest == null) closest = new Coordinate(visited[i][j], i, j);
					else if (closest.distance > visited[i][j]) closest = new Coordinate(visited[i][j], i, j);
				}
			}
		}
		return closest;
	}
}
