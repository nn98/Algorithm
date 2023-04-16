package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class CountingInversion {
    static int[] tree;

    static void add(int index, int value) {
        while (index < tree.length) {
            tree[index] += value;
            index += (index & -index);
        }
    }

    static int sum(int index) {
        int result = 0;
        while (index > 0) {
            result += tree[index];
            index &= index - 1;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(reader.readLine());
        tree = new int[size+1];
        int result = 0;
        for (int i = 1; i <= size; i++) {
            int value = Integer.parseInt(reader.readLine());
            int inversion = sum(size) - sum(value);
            add(value,1);
            System.out.println(Arrays.toString(tree)+" "+sum(size)+" "+sum(value)+" "+inversion);
            result += inversion;
        }
        System.out.println(result);
    }
}
