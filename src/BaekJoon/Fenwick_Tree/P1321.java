package BaekJoon.Fenwick_Tree;

import java.io.*;
import java.util.*;

public class P1321 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()), i = 0, j, m, f;
        FenwickTree tree = new FenwickTree(n);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (; i < n; tree.add(++i, Integer.parseInt(st.nextToken()))) ;
        m = Integer.parseInt(br.readLine());
        for (; m-- > 0; ) {
            st = new StringTokenizer(br.readLine());
            f = Integer.parseInt(st.nextToken());
            i = Integer.parseInt(st.nextToken());
            if (f == 1) {
                j = Integer.parseInt(st.nextToken());
                tree.add(i, j);
            } else {
                int left = 1, right = n, mid = (left + right) / 2;
                while (true) {
                    if (tree.sum(mid) >= i) {
                        if (tree.sum(mid - 1) < i) {
                            bw.write(mid + "\n");
                            break;
                        }
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                    mid = (left + right) / 2;
                }
            }
        }
        bw.flush();
    }

    static class FenwickTree {
        static int[] tree;

        public FenwickTree(int size) {
            tree = new int[size + 1];
        }

        long sum(int pos) {
            long result = 0;
            while (pos > 0) {
                result += tree[pos];
                pos &= (pos - 1);
            }
            return result;
        }

        void add(int pos, int val) {
            while (pos < tree.length) {
                tree[pos] += val;
                pos += (pos & -pos);
            }
        }
    }
}