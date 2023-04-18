package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3895 {
    static int[] tree;
    static boolean[] removed;

    static void add(int idx, int val) {
        while (idx < tree.length) {
            tree[idx] += val;
            idx += (idx & -idx);
        }
    }

    static int sum(int idx) {
        int res = 0;
        while (idx > 0) {
            res += tree[idx];
            idx &= (idx - 1);
        }
        return res;
    }

    static int find(int from, int to, int val) {
        int mid = (from + to) / 2;
        int now = sum(mid);
//        System.out.println(String.format("\tFrom: %d To: %d Val: %d Mid: %d Now: %d", from, to, val, mid, now));
        if(removed[mid]) {
//            System.out.println("\tis removed");
            if (now == val) return find(from, to - 1, val);
        }
        if (now == val) return mid;
        if (now > val) return find(from, mid - 1, val);
        else return find(mid + 1, to, val);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());
            if (n < 1) {
                writer.flush();
                return;
            }
            tree = new int[n + 1];
            removed = new boolean[n + 1];
            for (int i = 0; i++ < n; ) {
                add(i, 1);
            }
//            System.out.println(Arrays.toString(tree));
            int flag=2;
            int next=m;
            while (flag > 1) {
                add(m, -1);
                removed[m]=true;
                int ahead = sum(m - 1);
                flag = sum(n);
                int to = (ahead + k) % flag;
//                System.out.println(String.format("(%d + %d) %% %d = %d", ahead, k, flag, to));
                if (to < 1) {
                    to = flag;
                }
                next = find(1, n, to);
//                System.out.println("next: " + next);
                m = next;
//                m = to;
//                m += (m-sum(m));
//                if (m < 1) m = sum(n);
//                System.out.println(Arrays.toString(tree));
//                for (int i = 0; i++ < n; System.out.print(sum(i) - sum(i - 1) + " ")) ;
//                System.out.println();
            }
//            System.out.println(Arrays.toString(tree));
            writer.write(next+"\n");
        }
    }
}
