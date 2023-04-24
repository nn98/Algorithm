package BaekJoon.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P24230 {
    static int[] tree;
    static boolean[] visit;
    static List<List<Integer>> connection = new ArrayList<>();
    static int n;
    static int res;

    static void o(int idx, int color) {
        visit[idx] = true;
        if (tree[idx] != color) {
            res += 1;
            color = tree[idx];
        }
        for (int next : connection.get(idx)) {
            if (!visit[next]) {
                o(next, color);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(reader.readLine());
        tree = new int[n + 1];
        visit = new boolean[n + 1];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        connection.add(null);
        for (int i = 0; i < n; i++) {
            connection.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            connection.get(from).add(to);
            connection.get(to).add(from);
        }
        o(1, 0);
        writer.write(String.valueOf(res));
        writer.flush();
    }
}
