package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1321 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), i=0;
        FenwickTree tree=new FenwickTree(n);
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(;i<n;tree.add(++i,Integer.parseInt(st.nextToken())));
        System.out.println(Arrays.toString(tree.tree));
        for(i=0;i++<n; System.out.println(tree.sum(i)));
        for(i=0;i++<n; System.out.println(tree.sum(i)-tree.sum(i-1)));
    }
    static class FenwickTree {
        static int[] tree;

        public FenwickTree(int size) {
            tree = new int[size+1];
        }

        long sum(int pos){
            long result = 0;
            while(pos > 0){
                result += tree[pos];
                pos &= (pos-1);
            }
            return result;
        }

        void add(int pos, int val){
            while(pos < tree.length){
                System.out.println(pos);
                tree[pos] += val;
                pos += (pos & -pos);
            }
        }
    }
}