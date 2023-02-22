package BaekJoon.Floyd_Warshall;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P13141 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = reader.readLine().split(" ");
        int n = Integer.parseInt(a[0]), m = Integer.parseInt(a[1]), i = 1, j, k, d[][] = new int[n + 1][n + 1], s[] = new int[n * n + n], e[] = new int[n * n + n], X[] = new int[n * n + n], mn = Integer.MAX_VALUE;
        for (; i <= n; i++) {
            Arrays.fill(d[i], 20005);
            d[i][i] = 0;
        }
        for (i = 1; i <= m; i++) {
            a = reader.readLine().split(" ");
            s[i] = Integer.parseInt(a[0]);
            e[i] = Integer.parseInt(a[1]);
            X[i] = Integer.parseInt(a[2]);
            d[s[i]][e[i]] = Math.min(d[s[i]][e[i]], X[i]);
            d[e[i]][s[i]] = Math.min(d[e[i]][s[i]], X[i]);
//            for (int[] x : d) System.out.println(Arrays.toString(x));
//            System.out.println(Arrays.toString(s));
//            System.out.println(Arrays.toString(e));
//            System.out.println(Arrays.toString(X));
        }
        for (k = 1; k <= n; k++)
            for (i = 1; i <= n; i++) for (j = 1; j <= n; j++) d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
        for (i = 1; i <= n; i++) {
            int mx = 0;
            for (j = 1; j <= m; j++) mx = Math.max(mx, d[i][s[j]] + d[i][e[j]] + X[j]);
            mn = Math.min(mn, mx);
        }
        System.out.print(mn / 2 + "." + mn % 2 * 5);
    }
}
