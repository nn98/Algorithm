package BaekJoon.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class P1238 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[][] hist = new int[n+1][n+1];
		List<List<Node>> matrix = new ArrayList<>();
		matrix.add(null);
		for(int i=0;i<n;i++) matrix.add(new LinkedList<>());
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			matrix.get(from).add(new Node(to,dist));
		}
		for(int i = 1; i<=n; i++) {
			dijkstra(matrix, hist, i);
		}
		for(int[] a : hist)
			System.out.println(Arrays.toString(a));
	}
	static void dijkstra(List<List<Node>> matrix, int[][] hist, int idx) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(idx, 0));
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int nowIdx = node.idx;
			int nowDist = node.dist;
			if(hist[idx][nowIdx] != 0 && hist[idx][nowIdx]<nowDist) continue;
			hist[idx][nowIdx]=nowDist;
			for(Node n : matrix.get(nowIdx)) {
				int nextIdx = n.idx;
				int nextDist = n.dist + nowDist;
				if(hist[idx][nowIdx] == 0 || hist[idx][nextIdx]>nextDist) {
					hist[idx][nextIdx] = nextDist;
					pq.add(new Node(nextIdx, nextDist));
				}
			}
		}
	}
	static class Node implements Comparable<Node> {
		int idx;
		int dist;
		Node(int idx, int dist) {
			this.idx = idx;
			this.dist = dist;
		}
		@Override
		public int compareTo(Node o) {
			return this.dist-o.dist;
		}
		@Override
		public String toString() {
			return "Node{" +
				"idx=" + idx +
				", dist=" + dist +
				'}';
		}
	}
}
