package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class P3770_2 {
    static int[] tree;

    static class IO {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        static String readLine() throws Exception {
            return reader.readLine();
        }

        static void write(String line) throws Exception {
            writer.write(line);
        }

        static void flush() throws Exception {
            writer.flush();
        }
    }

    static int init() throws Exception {
        int caseCount = Integer.parseInt(IO.reader.readLine());
        for (int i = 0; i < caseCount; i++) {
            IO.write(String.format("Test case %d: ", i + 1));
            solution();
        }
        return 0;
    }

    static void solution() throws Exception {
        StringTokenizer tokenizer = new StringTokenizer(IO.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        tree = new int[m + 1];
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < k; i++) {
            tokenizer = new StringTokenizer(IO.readLine());
            int east = Integer.parseInt(tokenizer.nextToken());
            int west = Integer.parseInt(tokenizer.nextToken());
            if (map.get(east) == null) {
                map.put(east, new ArrayList<>());
            }
            map.get(east).add(west);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        long res = 0;
        for (int key : keys) {
            Collections.sort(map.get(key));
            for (int value : map.get(key)) {
                long inversion = sum(m) - sum(value);
                res += inversion;
                add(value, 1);
            }
        }
        IO.write(res + "\n");
    }

    static long sum(int idx) {
        long res = 0;
        while (idx > 0) {
            res += tree[idx];
            idx &= (idx - 1);
        }
        return res;
    }

    static void add(int idx, int value) {
        while (idx < tree.length) {
            tree[idx] += value;
            idx += (idx & -idx);
        }
    }

    public static void main(String[] args) throws Exception {
        init();
        IO.flush();
    }
}