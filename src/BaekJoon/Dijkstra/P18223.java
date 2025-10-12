package BaekJoon.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P18223 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		List<int[]>[] matrix = new ArrayList[v+1];
		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (matrix[a] == null) matrix[a] = new ArrayList<>();
			matrix[a].add(new int[]{b,c});
			if (matrix[b] == null) matrix[b] = new ArrayList<>();
			matrix[b].add(new int[]{a,c});
		}
		int[] defaultPath = new int[v+1];
		Arrays.fill(defaultPath, Integer.MAX_VALUE);
		solve(matrix, 1, defaultPath);

		int[] gunwooPath = new int[v+1];
		Arrays.fill(gunwooPath, Integer.MAX_VALUE);
		solve(matrix, p, gunwooPath);

		// System.out.println(Arrays.toString(defaultPath) + "\n");
		// System.out.println(Arrays.toString(gunwooPath));
		System.out.println(gunwooPath[1] + gunwooPath[v] == defaultPath[v] ? "SAVE HIM" : "GOOD BYE");
	}
	static void solve(List<int[]>[] matrix, int start, int[] path) {

		PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
		q.offer(new int[]{start,0});
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			if (path[cur[0]] < cur[1]) continue;
			path[cur[0]] = cur[1];
			for (int[] a : matrix[cur[0]]) {
				int nextNode = a[0];
				int nextDist = a[1] + cur[1];
				if (path[nextNode] < nextDist) continue;
				path[nextNode] = nextDist;
				q.offer(new int[]{nextNode,nextDist});
			}
		}
	}
}
