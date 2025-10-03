package BaekJoon.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class P2665 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] matrix = new int[n][n];
		int[][] history = new int[n][n];
		int[] nX = {1, -1, 0, 0};
		int[] nY = {0, 0, 1, -1};
		for(int i=0;i<n;i++) {
			matrix[i] = new int[n];
			history[i] = new int[n];
			Arrays.fill(history[i], Integer.MAX_VALUE);
			int j = 0;
			for(char c: br.readLine().toCharArray()) matrix[i][j++] = c-'0';
		}
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0,0,0));
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int nowX = node.x;
			int nowY = node.y;
			int nowD = node.dis;
			if(history[nowX][nowY] < nowD)continue;
			history[nowX][nowY] = nowD;
			for(int i=0;i<4;i++) {
				int newX = nowX + nX[i];
				int newY = nowY + nY[i];
				if(newX >= 0 && newX < n && newY >=0 && newY < n) {
					int flag = matrix[newX][newY] < 1 ? 1 : 0;
					if(history[newX][newY] != Integer.MAX_VALUE && history[newX][newY] <= nowD + flag) continue;
					history[newX][newY] = nowD + flag;
					pq.add(new Node(newX, newY, nowD + flag));
				}
			}
		}
		System.out.println(history[n-1][n-1]);
	}
	static class Node implements Comparable<Node> {
		int x;
		int y;
		int dis;
		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.dis, o.dis);
		}
		Node(int x, int y, int dis) {
			this.x = x;
			this.y = y;
			this.dis = dis;
		}
	}
}
