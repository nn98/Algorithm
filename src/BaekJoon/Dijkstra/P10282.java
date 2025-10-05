package BaekJoon.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class P10282 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nx = Integer.parseInt(br.readLine());
		for (int ix = 0; ix < nx; ix++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			HashMap<Integer, Integer>[] matrix = new HashMap[n+1];
			for (int i = 0; i < d; i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				int dis = Integer.parseInt(st.nextToken());
				if (matrix[end] == null) matrix[end] = new HashMap<>();
				matrix[end].put(dis, start);
			}
			int[] history = new int[n+1];
			Arrays.fill(history, Integer.MAX_VALUE);
			PriorityQueue<Node> pq = new PriorityQueue<>();
			pq.add(new Node(c,0));
			while (!pq.isEmpty()) {
				Node cur = pq.poll();
				int nowIdx = cur.target;
				int nowDis = cur.dis;
				if (history[nowIdx] < nowDis || matrix[nowIdx] == null) continue;
				history[nowIdx] = cur.dis;
				for(Map.Entry<Integer, Integer> entry : matrix[nowIdx].entrySet()) {
					int nextDis = entry.getKey();
					int nextIdx = entry.getValue();
					if (history[nextIdx] < nowDis + nextDis) continue;
					history[nextIdx] = nowDis + nextDis;
					pq.add(new Node(nextIdx,nextDis));
				}
			}
			// System.out.println(Arrays.toString(history));
			// System.out.println(Arrays.stream(history).filter(x -> x != Integer.MAX_VALUE).count() + " " + Arrays.stream(history).filter(x -> x != Integer.MAX_VALUE).max().getAsInt());
			long count = Arrays.stream(history).filter(x -> x != Integer.MAX_VALUE).count();
			int maxVal = Arrays.stream(history).filter(x -> x != Integer.MAX_VALUE).max().getAsInt();
			System.out.println(count + " " + maxVal);
		}
	}
	static class Node implements Comparable<Node>{
		int target;
		int dis;
		Node(int target, int dis) {
			this.target = target;
			this.dis = dis;
		}
		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.dis, o.dis);
		}
	}
}
