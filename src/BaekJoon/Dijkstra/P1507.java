package BaekJoon.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1507 {
	public static void main(String[] args) throws IOException {
		// HashMap<Integer, Integer> map = new HashMap<>();
		// System.out.println(map.put(0, 0));
		// System.out.println(map.put(2, 0));
		// System.out.println(map.get(0));
		// System.out.println(map.entrySet());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}
}
