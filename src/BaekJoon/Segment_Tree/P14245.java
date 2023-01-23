package BaekJoon.Segment_Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14245 {
    public static void main(String[] args) throws IOException {
        int n, m, k, i = 0;
//        System.out.println(i - (i & -i));
//        System.out.println(i & (i-1));
//        i = 36;
//        System.out.println(i - (i & -i));
//        System.out.println(i & (i-1));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        long[] arr = new long[n + 1];
        long[] Tree = new long[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int prev = Integer.parseInt(st.nextToken());
        int now;
        update(Tree, 1, prev);
        for(i=2; i<=n; i++) {
            now = Integer.parseInt(st.nextToken());
            update(Tree, i, now - prev);
            prev = now;
//            update(Tree, i, arr[i]);
        }

        for (i = Integer.parseInt(br.readLine()); i > 0; i--) {
            st = new StringTokenizer(br.readLine().trim());
            int num = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());
            if (num == 1) {
                int idx2 = Integer.parseInt(st.nextToken()) + 1;
                long val = Long.parseLong(st.nextToken());
                arr[idx] = val;
                update(Tree, idx, val);
                update(Tree, idx2, -val);
            } else {
                System.out.println(sum(Tree, idx) - sum(Tree, idx - 1));
            }
        }
    }

    public static void update(long[] tree, int i, long diff) {
        while (i < tree.length) {
            tree[i] += diff;
            i += (i & -i);
            System.out.println(Arrays.toString(tree));
        }
    }

    public static long sum(long[] tree, int i) {
        long ans = 0;
        while (i > 0) {
            ans += tree[i];
            i -= (i & -i);
        }
        return ans;
    }
}