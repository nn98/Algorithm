package BaekJoon.Prefix_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1687 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] prefixSum = new int[N + 1][M + 1];
        for (int i = 0; i < N; i++) {
            char[] c = br.readLine().toCharArray();

            for (int j = 0; j < M; j++) {
                prefixSum[i + 1][j + 1] = (c[j] - '0')
                        + prefixSum[i][j + 1] + prefixSum[i + 1][j]
                        - prefixSum[i][j];
            }
        }

        int answer = 0;
        for (int startCol = 1; startCol <= M; startCol++) {
            for (int endCol = 1; endCol <= M; endCol++) {
                int startRow = 1;
                int prePrefixSum = 0;

                for (int endRow = 1; endRow <= N; endRow++) {
                    int culPrefixSum = prefixSum[endRow][endCol] - prefixSum[endRow][startCol - 1];

                    if (culPrefixSum == prePrefixSum) {
                        answer = Math.max(answer, (endCol - startCol + 1) * (endRow - startRow + 1));
                    }

                    if (culPrefixSum > prePrefixSum) {
                        startRow = endRow + 1;
                    }

                    prePrefixSum = culPrefixSum;
                }
            }
        }

        System.out.println(answer);
        br.close();
    }
}
