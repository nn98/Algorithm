package BaekJoon.Fenwick_Tree;

import java.io.*;
import java.util.*;

public class P17400 {
    static long[][] flag = new long[2][];
    static int[] length = new int[2];
    static int flags;

    static void add(int OE, int idx, int val) {
        while (idx < length[OE]) {
            flag[OE][idx] += val;
            idx += (idx & -idx);
        }
    }

    static long sum(int OE, int idx) {
        long res = 0;
        while (idx > 0) {
            res += flag[OE][idx];
            idx &= (idx - 1);
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        flags = n;
        length[0] = flags / 2 + flags % 2 + 1;
        length[1] = flags / 2 + 1;
        flag[0] = new long[length[0]];
        flag[1] = new long[length[1]];
        st = new StringTokenizer(reader.readLine());
        for (int i = 1; i++ <= flags; ) {
            add(i % 2, i / 2, Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(reader.readLine());
            int f = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken()) + 1;
            int b = Integer.parseInt(st.nextToken());
            if (f < 2) {
                int oddFront = a / 2 + a % 2;
                int oddTail = b / 2 + b % 2;
                int evenFront = a / 2;
                int evenTail = b / 2;
                long oSum = sum(0, oddTail) - sum(0, oddFront - 1);
                long eSum = sum(1, evenTail) - sum(1, evenFront - 1);
                long res = Math.abs(oSum - eSum);
                writer.write(res + "\n");
            } else {
                add(a % 2, a / 2, b);
            }
        }
        writer.flush();
    }
}