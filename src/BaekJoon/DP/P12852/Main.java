package BaekJoon.DP.P12852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int[] dp = new int[number + 3];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        for (int i = 2; i <= number + 1; i++) {
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            }
            dp[i] = Math.min(dp[i - 1] + 1, dp[i]);
        }
        System.out.println(dp[number]);
        while (number > 0) {
            System.out.print(number + " ");
            int next = number - 1;
            if (number % 2 == 0 && (dp[number / 2] + 1) == dp[number]) {
                next = number / 2;
            }
            if (number % 3 == 0 && (dp[number / 3] + 1) == dp[number]) {
                next = number / 3;
            }
            number = next;
        }
    }
}
