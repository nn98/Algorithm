package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CountingInversion {
    static long[] tree;

    static void add(int index, long value) {
        while (index < tree.length) {
            tree[index] += value;
            index += (index & -index);
        }
    }

    static long sum(int index) {
        long result = 0;
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
        tree = new long[size + 1];
        long result = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        for (long i = 1; i <= size; i++) {
            int value = Integer.parseInt(stringTokenizer.nextToken());
            long inversion = sum(size) - sum(value);
            add(value, 1);
//            System.out.println(Arrays.toString(tree)+" "+sum(size)+" "+sum(value)+" "+inversion);
            result += inversion;
        }
        System.out.println(result);
    }
}
