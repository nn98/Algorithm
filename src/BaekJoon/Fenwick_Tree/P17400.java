package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P17400 {
    static long[][] flag = new long[2][];
    static int[] length = new int[2];
    static int flags;

    static void add(int OE, int idx, int val) {
        while (idx < length[OE]) {
            flag[OE][idx] += val;
            idx += (idx & -idx);
        }
    }

    static long sum(int OE, int idx) {
        long res = 0;
        while (idx > 0) {
            res += flag[OE][idx];
            idx &= (idx - 1);
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        flags = n;
        length[0] = flags / 2 + flags % 2 + 1;
        length[1] = flags / 2 + 1;
        flag[0] = new long[length[0]];
        flag[1] = new long[length[1]];
        st = new StringTokenizer(reader.readLine());
        for (int i = 1; i++ <= flags; ) { // 0 홀 1 짝 0 홀 ... + 제일 앞 비우기 == i=1; i++
            add(i % 2, i / 2, Integer.parseInt(st.nextToken()));
        }
        System.out.println(Arrays.toString(flag[0]));
        System.out.println(Arrays.toString(flag[1]));
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(reader.readLine());
            int f = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken()) + 1;
            int b = Integer.parseInt(st.nextToken());
            if (f < 2) {
                int oddFront = a / 2 + a % 2;
                int oddTail = b / 2 + b % 2;
                int evenFront = a / 2;
                int evenTail = b / 2;
                System.out.println(String.format("0: %d ~ %d", oddFront, oddTail));
                long oSum = sum(0, oddTail) - sum(0, oddFront - 1);
                System.out.println(oSum);
                System.out.println(String.format("1: %d ~ %d", evenFront, evenTail));
                long eSum = sum(1, evenTail) - sum(1, evenFront - 1);
                System.out.println(eSum);
                long res = Math.abs(oSum - eSum);
                writer.write(res+"\n");
            } else {
                add(a % 2, a / 2, b);
                System.out.println("\t" + Arrays.toString(flag[0]));
                System.out.println("\t" + Arrays.toString(flag[1]));
            }
        }
        writer.flush();
    }
}

/*
[0, 3, 4, 5]
[0, 1, 1, 9]

[0, 3, 7, 5]
[0, 1, 2, 9]
 */