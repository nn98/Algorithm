package BaekJoon.Fenwick_Tree;

import java.io.*;
import java.util.*;

public class P3770 {
    static int n,k;
    static int[] tree;

    static void update(int idx, int val) {
        while (idx <= n) {
            tree[idx] += val;
            idx += idx & -idx;
        }
    }

    static long sum(int idx) {
        long res = 0;
        while (idx > 0) {
            res += tree[idx];
            idx -= idx & -idx;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int x=0;x++<X;){
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            tree = new int[(n>m?n:m) + 1];
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                map.computeIfAbsent(a, list -> new ArrayList<>()).add(b);
            }

            List<Integer> keyList = new ArrayList<>(map.keySet());
            Collections.sort(keyList);

            int idx = 0;
            long res = 0;
            for (int key : keyList) {
                for (int num : map.get(key)) {
                    res += (idx++) - sum(num);
                    update(num, 1);
                }
            }
            System.out.print(res);
        }
    }
}