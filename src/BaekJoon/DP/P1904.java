package BaekJoon.DP;

import java.util.Scanner;

public class P1904 {
	static long[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		dp = new long[10000001];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] =2;
		for (int i = 3; i <= N; i++) {
			dp(i);
		}
		System.out.println(dp[N]);
	}
	public static void dp(int i) {
		dp[i] = (dp[i-1]+dp[i-2])%15746;
	}
}
