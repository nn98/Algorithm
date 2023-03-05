package BaekJoon.DP;
//GG
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P2494 {
    static int n, i, a[], b[], h[][], r;

    static void o(int x, int v) {
        System.out.println(x + " " + v);
        int save = 0;
        if (v < 0) {
            save = Math.abs(v);
            v=0;
        }
        int now = (a[x] + v) % 10, dist = b[x] - now, left = dist < 0 ? 10 + dist : dist, right = dist < 0 ? Math.abs(dist) : 10 - dist, go;
        System.out.printf("\tnow: %d left: %d right: %d\n", now, left, right);
        h[x][now] = v;
        x++;
        if (x == n) {
            int V = v + Math.min(left, right);
            if (r == 0) r = V;
            else r = r > v ? v : r;
            return;
        }
        go = (v + left) % 10;
        if (h[x][go] < 1 || h[x][go] > v + left) o(x, go);
        go = Math.abs((v - right) % 10);
        if (h[x][go] < 1 || h[x][go] > v + right) o(x, v);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(reader.readLine());
        a = new int[n];
        b = new int[n];
        h = new int[n][10];
        for (char c : reader.readLine().toCharArray()) a[i++] = c - '0';
        i = 0;
        for (char c : reader.readLine().toCharArray()) b[i++] = c - '0';
        o(0, 0);
        System.out.println(r);
        for (int[] X : h) System.out.println(Arrays.toString(X));
    }
}
