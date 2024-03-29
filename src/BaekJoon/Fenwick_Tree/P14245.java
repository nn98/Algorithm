package BaekJoon.Fenwick_Tree;
import java.io.*;
import java.util.StringTokenizer;

public class P14245 {

    static long[] tree;
    static int n;
    static void add(int pos, int val) {
        while(pos <= n) {
            tree[pos] ^= val;
            pos += (pos&-pos);
//            System.out.println(Arrays.toString(tree));
        }
    }

    static long sum(int pos) {
        long result = 0;
        while(pos > 0) {
            result ^= tree[pos];
            pos &= (pos-1);
        }
        return result;

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new long[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
//        int prev = Integer.parseInt(st.nextToken());
//        int now;
//        add(1, prev);
//        for(int i=2; i<=n; i++) {
//            now = Integer.parseInt(st.nextToken());
//            add(i, now - prev);
//            prev = now;
//        }
        for(int i=0;++i<=n;) {
            int j=Integer.parseInt(st.nextToken());
            add(i,j);
            add(i+1,j);
        }
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken())+1;

            if(op == 1) {
                int b = Integer.parseInt(st.nextToken())+1;
                int k = Integer.parseInt(st.nextToken());

                add(a, k);
                add(b+1, k);
            }else {
                sb.append(sum(a)+"\n");
            }

        }
        System.out.println(sb.toString());

    }
}