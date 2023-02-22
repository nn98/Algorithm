package BaekJoon.Fenwick_Tree;

public class FenwickTree {
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
            tree[pos] += val;
            pos += (pos & -pos);
        }
    }
}