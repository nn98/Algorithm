package BaekJoon.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P10282 {
	static class Edge {
		int to, w;
		Edge(int to, int w) { this.to = to; this.w = w; }
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nx = Integer.parseInt(br.readLine());
		for (int ix = 0; ix < nx; ix++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			@SuppressWarnings("unchecked")
			List<Edge>[] matrix = new ArrayList[n + 1];
			for (int i = 0; i <= n; i++) matrix[i] = new ArrayList<>();

			for (int i = 0; i < d; i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				int dis = Integer.parseInt(st.nextToken());
				// end -> start (b가 감염되면 a가 s초 뒤 감염)
				matrix[end].add(new Edge(start, dis));
			}

			int[] history = new int[n + 1];
			Arrays.fill(history, Integer.MAX_VALUE);

			// PQ<int[]>: [0]=정점, [1]=누적거리 (오름차순)
			PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
			pq.add(new int[]{c, 0});

			while (!pq.isEmpty()) {
				int[] cur = pq.poll();
				int nowIdx = cur[0];
				int nowDis = cur[1];
				if (history[nowIdx] < nowDis) continue;
				history[nowIdx] = nowDis;

				for (Edge e : matrix[nowIdx]) {
					int nextIdx = e.to;
					int nd = nowDis + e.w;
					if (history[nextIdx] <= nd) continue;
					history[nextIdx] = nd;
					pq.add(new int[]{nextIdx, nd});
				}
			}

			int count = 0, max = 0;
			for (int val : history) {
				if (val != Integer.MAX_VALUE) {
					count++;
					if (val > max) max = val;
				}
			}
			System.out.println(count + " " + max);
		}
	}
}
