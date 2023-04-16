package BaekJoon.Fenwick_Tree;

import BaekJoon._Contest.c819.B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class FenwickTree {
    static int[] tree;

    public FenwickTree(int size) {
        tree = new int[size + 1];
    }

    long sum(int pos) {
        long result = 0;
        while (pos > 0) {
            result += tree[pos];
            System.out.println(String.format("\tpos:%d result += %d pos>%d", pos, tree[pos], pos & (pos - 1)));
            pos &= (pos - 1);
        }
        return result;
    }

    void add(int pos, int val) {
        while (pos < tree.length) {
            tree[pos] += val;
            System.out.println(String.format("\tpos:%d -pos:%d (pos & -pos):%d", pos, -pos, pos & -pos));
            pos += (pos & -pos);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.tree);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.print("Tree Size: ");
        int size = Integer.parseInt(reader.readLine());
        FenwickTree fenwickTree = new FenwickTree(size);
        System.out.println(fenwickTree);
        for (int i = 1; i <= size; i++) {
            System.out.println("index " + i + ", value: ");
            int value = Integer.parseInt(reader.readLine());
            fenwickTree.add(i, value);
            System.out.println("result: " + fenwickTree);
        }
        for (int i = 1; i <= size; i++) {
            System.out.println(fenwickTree.sum(i));
        }
    }
}