package _Algorithm.BFS;

import java.util.Arrays;
import java.util.Scanner;

public class P6118 {
    static Scanner s = new Scanner(System.in);
    static int n = s.nextInt(), m = s.nextInt(), i, j, x = 0, a[][] = new int[n][n], h[] = new int[n], r[] = new int[n];

    static void o(int x, int v) {
        h[x] = v++;
        for (int i = 0; i < n; i++) {
            if (a[x][i] > 0)
                if (h[i] > v)
                    o(i, v);
        }
    }

    public static void main(String[] args) {
        for (; x < m; x++) {
            i = s.nextInt() - 1;
            j = s.nextInt() - 1;
            a[i][j] = a[j][i] = 1;
        }
        o(0, 0);
        System.out.println(Arrays.toString(h));
    }

}
