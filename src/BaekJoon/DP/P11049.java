package BaekJoon.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11049 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());

		int[] r = new int[n + 1];
		int[] c = new int[n + 1];

		int[] dims = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			r[i] = Integer.parseInt(st.nextToken());
			c[i] = Integer.parseInt(st.nextToken());
		}

		dims[0] = r[1];
		for (int i = 1; i <= n; i++) dims[i] = c[i];

		long[][] dp = new long[n + 1][n + 1];
		final long INF = Long.MAX_VALUE / 4;
		for (int i = 1; i <= n; i++) Arrays.fill(dp[i], INF);
		for (int i = 1; i <= n; i++) dp[i][i] = 0;

		for (int len = 2; len <= n; len++) {
			for (int i = 1; i + len - 1 <= n; i++) {
				int j = i + len - 1;
				long best = INF;
				for (int k = i; k < j; k++) {
					long cost = dp[i][k] + dp[k + 1][j]
							+ 1L * dims[i - 1] * dims[k] * dims[j];
					if (cost < best) best = cost;
				}
				dp[i][j] = best;
			}
		}
		System.out.println(dp[1][n]);
	}
}
