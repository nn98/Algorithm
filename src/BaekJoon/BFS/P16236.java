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
		int[][][] visited = new int[n][n][7];
		Coordinate start = null;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				space[i][j] = Integer.parseInt(st.nextToken());
				if (space[i][j] == 9) {
					start = new Coordinate(1,i,j);
				}
			}
		}
		PriorityQueue<Coordinate> queue = new PriorityQueue<>();
		queue.add(start);
		for(int i=1;i<7;i++) {
			sol(queue, space, visited, i);
			for(int x=0;x<n;x++) for(int y=0;y<n;y++) System.out.println(visited[x][y][i] + (y == n-1 ? "\n" : " "));
			break;
		}
		System.out.println(queue.poll());
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
	static void sol(PriorityQueue<Coordinate> queue, int[][] space, int[][][] visited, int level) {
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, -1, 0, 1};
		while (!queue.isEmpty()) {
			Coordinate curr = queue.poll();
			int distance = curr.distance;
			int x = curr.x;
			int y = curr.y;
			if (visited[x][y][level] == 0) visited[x][y][level] = distance;
			if (visited[x][y][level] <= distance) continue;
			visited[x][y][level] = distance;
			distance++;
			for (int i =0 ; i < 4; i++) {
				int nextX = x + dx[i];
				int nextY = y + dy[i];
				if (nextX < 0 || nextX >= space.length || nextY < 0 || nextY >= space[0].length) continue;
				if (space[nextX][nextY] > level) continue;
				if (visited[nextX][nextY][level] == 0 || visited[nextX][nextY][level] > distance) {
					visited[nextX][nextY][level] = distance;
					queue.add(new Coordinate(distance, nextX, nextY));
				}
			}
		}
	}
}
