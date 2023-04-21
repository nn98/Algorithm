package BaekJoon.Fenwick_Tree;
// ㅅㅂ 시간초과가 날 수도 아닐수도 있습니다
import java.io.*;
import java.util.*;

public class P19646 {

    static class IO {
        private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        private static StringTokenizer tokenizer;

        static String readLine() {
            try {
                return reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        }

        static void readLineToTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static String nextToken() {
            return tokenizer.nextToken();
        }

        static void write(String line) {
            try {
                writer.write(line);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void flush() {
            try {
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static void init() {
        int caseCount = Integer.parseInt(IO.readLine());
        size = caseCount;
        tree = new int[size + 1];
        IO.readLineToTokenizer();
        for (int i = 1; i <= size; i++) {
            add(i, Integer.parseInt(IO.nextToken()));
        }
        removeIndex = new int[size];
        IO.readLineToTokenizer();
        for (int i = 0; i < size; i++) {
            removeIndex[i] = Integer.parseInt(IO.nextToken());
        }
    }

    static void add(int idx, int val) {
        while (idx <= size) {
            tree[idx] += val;
            idx += (idx & -idx);
        }
    }

    static int sum(int idx) {
        int res = 0;
        while (idx > 0) {
            res += tree[idx];
            idx &= (idx - 1);
        }
        return res;
    }

    static int find(int from, int to, int val) {
        int mid = (from + to) / 2;
        int midSum = sum(mid);
        int checkZero = 0;
        while (midSum != 0 && midSum == sum(mid - (checkZero + 1))) {
            checkZero += 1;
        }
        mid -= checkZero;
        if (midSum >= val) {
            if (sum(mid - 1) < val) {
                return mid;
            }
            return find(from, mid - 1, val);
        } else {
            return find(mid + checkZero + 1, to, val);
        }
    }

    static void solution() {
        for (int i = 0; i < size; i++) {
            int res = find(1, size, removeIndex[i]);
            IO.write(res + " ");
            add(res, -(sum(res) - sum(res - 1)));
        }
    }

    static int[] tree;
    static int[] removeIndex;
    static int size;

    public static void main(String[] args) {
        init();
        solution();
        IO.flush();
    }
}
