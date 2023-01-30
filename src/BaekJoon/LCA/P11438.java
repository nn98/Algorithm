package BaekJoon.LCA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P11438 {
    static int number, length, index, sIndex;
    static int[] no2serial, serial2no, locInTrip, tree;
    static List<Integer> trip = new ArrayList<>();
    static List<Integer>[] list;
    static boolean[] visited;

    static void dfs(int x) {
        locInTrip[x] = index++;
        serial2no[++sIndex] = x;
        no2serial[x] = sIndex;
        trip.add(no2serial[x]);
        visited[x] = true;
        for (int i : list[x]) {
            if (!visited[i]) {
                dfs(i);
                trip.add(no2serial[x]);
                index++;
            }
        }
    }

    static int getTreeSize(int size) {
        int h = (int) Math.ceil(Math.log(size) / Math.log(2)) + 1;
        return (int) Math.pow(2, h) - 1;
    }

    static int init(int start, int end, int node) {
        if (start == end) {
            return tree[node] = trip.get(start);
        }
        int mid = (start + end) / 2;
        return tree[node] = Math.min(init(start, mid, node * 2), init(mid + 1, end, node * 2 + 1));
    }

    static int query(int n, int s, int e, int l, int r) {
        if (r < s | e < l) return Integer.MAX_VALUE;
        if (l <= s && e <= r) return tree[n];
        int m = (s + e) / 2;
        return Math.min(query(n * 2, s, m, l, r), query(n * 2 + 1, m + 1, e, l, r));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        number = Integer.parseInt(reader.readLine()) + 1;
        list = new List[number];
        for (int i = 0; ++i < number; list[i] = new ArrayList<>()) ;
        no2serial = new int[number];
        serial2no = new int[number];
        locInTrip = new int[number];
        visited = new boolean[number];
        for (int i = 1; i < number - 1; i++) {
            String[] input = reader.readLine().split(" ");
            int n0 = Integer.parseInt(input[0]);
            int n1 = Integer.parseInt(input[1]);
            list[n0].add(n1);
            list[n1].add(n0);
        }
        dfs(1);
        length = trip.size();
        tree = new int[getTreeSize(length)];
        init(0, length - 1, 1);
        System.out.println(Arrays.toString(no2serial));
        System.out.println(Arrays.toString(serial2no));
        System.out.println(Arrays.toString(locInTrip));
        System.out.println(Arrays.toString(tree));
        int vertexes = Integer.parseInt(reader.readLine());
        for (int k = 0; k < vertexes; k++) {
            String[] input = reader.readLine().split(" ");
            int n0 = Integer.parseInt(input[0]);
            int n1 = Integer.parseInt(input[1]);
            n0 = locInTrip[n0];
            n1 = locInTrip[n1];
            if (n0 > n1) {
                int temp = n0;
                n0 = n1;
                n1 = temp;
            }
            writer.write(serial2no[query(1, 0, length - 1, n0, n1)] + "\n");
        }
        writer.flush();
    }
}
