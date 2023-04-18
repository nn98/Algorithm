package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P17400 {
    static int[][] flag = new int[2][];
    static int flags, oL, eL;

//    Pair 형식이 없다보니 모듈화가 안되나
//    static int calcIdx(int idx) {
//        int div = idx / 2;
//        int remain = idx % 2;
//
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        flags = n;
        oL = flags / 2 + flags % 2 + 1;
        eL = flags / 2 + 1;
        flag[0] = new int[oL];
        flag[1] = new int[eL];
        st = new StringTokenizer(reader.readLine());
        for (int i = 1; i++ <= flags; ) { // 0 홀 1 짝 0 홀 ... + 제일 앞 비우기 == i=1; i++
            flag[i % 2][i / 2] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(flag[0]));
        System.out.println(Arrays.toString(flag[1]));
    }
}
