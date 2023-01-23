package BaekJoon.Segment_Tree;
import java.io.*;

public class P1989_C {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static String[] input;
    public static int[] arr;
    public static long[][] seg_tree;
    public static long ans = 0;
    public static int[] result = new int[2];
    public static int n;
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        seg_tree = new long[4*n][2];
        input = br.readLine().split(" ");
        for(int i = 0; i < n; ++i)
            arr[i] = Integer.parseInt(input[i]);
        result[0] = 1;
        result[1] = 1;
        init(0, n-1, 1);
        get(0, n-1);
        bw.write(ans + "\n" + result[0] + " " + result[1] + "\n");
        br.close();
        bw.close();
        return;
    }

    public static long[] init(int start, int end, int node) {
        if(start == end) {
            seg_tree[node][0] = start;
            seg_tree[node][1] = arr[start];
            return seg_tree[node];
        }

        int mid = (start + end)/2;
        long[] l = init(start, mid, node*2);
        long[] r = init(mid+1, end, node*2+1);
        seg_tree[node][0] = (arr[(int)l[0]] < arr[(int)r[0]]) ? l[0] : r[0];
        seg_tree[node][1] = l[1] + r[1];
        return seg_tree[node];
    }

    public static long[] get_max(int start, int end, int node, int left, int right) {
        if(end < left || right < start)
            return new long[]{-1, 0};
        if(left <= start && end <= right)
            return seg_tree[node];

        int mid = (start+end)/2;
        long[] l = get_max(start, mid, node*2, left, right);
        long[] r = get_max(mid+1, end, node*2+1, left, right);

        if(l[0] == -1)
            return r;
        if(r[0] == -1)
            return l;

        return new long[]{(arr[(int)l[0]] < arr[(int)r[0]]) ? l[0] : r[0], l[1] + r[1]};
    }

    public static void get(int left, int right) {
        if(left > right)
            return;
        long[] cur = get_max(0, n-1, 1, left, right);
        if(ans < arr[(int)cur[0]] * cur[1]) {
            ans = arr[(int)cur[0]] * cur[1];
            result[0] = left+1;
            result[1] = right+1;
        }
        get(left, (int)cur[0]-1);
        get((int)cur[0]+1, right);
    }
}