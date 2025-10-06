package BaekJoon.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1719 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] matrix = new int[n+1][n+1];
		// for(int i = 1; i <= n; i++) Arrays.fill(matrix[i], Integer.MAX_VALUE);
		for(int i=0;i<m;i++){
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			matrix[x][y] = d;
			matrix[y][x] = d;
		}
		// for(int x = 1 ; x<=n; x++){
		// 	for(int y = 1 ; y<=n; y++){
		// 		System.out.print(matrix[x][y] + (y == n ? "\n" : " "));
		// 	}
		// }
		// System.out.println();
		for(int i=1;i<=n;i++){
			int[][] distances = new int[n+1][2];
			for (int j = 1; j <= n; j++) {
				distances[j][0] = Integer.MAX_VALUE;
			}
			solution(n, i, matrix, distances);
			// for (int j = 1; j <= n; j++) {
			// 	System.out.print(distances[j][0] + (j == n ? "\n" : " "));
			// }
			// System.out.println("--------------------------------");
			// for (int j = 1; j <= n; j++) {
			// 	System.out.print(distances[j][1] + (j == n ? "\n" : " "));
			// }
			// System.out.println();
			for (int j = 1; j <= n; j++) {
				sb.append((i == j ? "-" : distances[j][1]) + (j == n ? "\n" : " "));
			}
		}
		System.out.print(sb);
	}
	static void solution(int n, int idx, int[][] matrix, int[][] distances) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[1], o2[1]));
		pq.offer(new int[]{idx, 0, 0});
		while(!pq.isEmpty()){
			int[] cur = pq.poll();
			int nowIdx = cur[0];
			int nowDis = cur[1];
			int nowFirstIdx = cur[2];
			System.out.println(String.format("start: %d / now: %d / nowDis: %d / nowFirst: %d", idx, nowIdx, nowDis, nowFirstIdx));
			if(distances[nowIdx][0] < nowDis) continue;
			distances[nowIdx][1] = nowFirstIdx;
			for(int nextIdx = 1; nextIdx <= n; nextIdx++) {
				if(nextIdx == nowIdx || matrix[nowIdx][nextIdx] == 0) {
					System.out.println("here? 01");
					continue;
				}
				int nextDis = matrix[nowIdx][nextIdx] + nowDis;
				if(distances[nextIdx][0] < nextDis)  {
					System.out.println("here? 02");
					continue;
				}
				distances[nextIdx][0] = nextDis;
				int firstIdx = nowFirstIdx == 0 ? nextIdx : nowFirstIdx;
				distances[nextIdx][1] = firstIdx;
				pq.offer(new int[]{nextIdx, nextDis, firstIdx});
			}
		}
	}
}
