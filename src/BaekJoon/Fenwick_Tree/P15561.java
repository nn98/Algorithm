package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P15561 {
    static int n, q, u, v;
    static long[] tree;

    static void add(int idx, int val) {
        while (idx <= n) {
            tree[idx] += val;
            idx += (idx & -idx);
        }
    }

    static long sum(int idx) {
        long res = 0;
        while (idx > 0) {
            res += tree[idx];
            idx &= (idx - 1);
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        q = Integer.parseInt(tokenizer.nextToken());
        u = Integer.parseInt(tokenizer.nextToken());
        v = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        tree = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            int val = Integer.parseInt(tokenizer.nextToken());
            add(i, val);
        }
        System.out.println(Arrays.toString(tree));

        while (q > 0) {
            q--;
            tokenizer = new StringTokenizer(reader.readLine());
            int flag = Integer.parseInt(tokenizer.nextToken());
            int i = Integer.parseInt(tokenizer.nextToken());
            int j = Integer.parseInt(tokenizer.nextToken());
            if (flag < 1) {
                long sum = sum(j) - sum(i);
            } else {

            }
        }
    }
}