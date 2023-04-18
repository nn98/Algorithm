package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
//        크기는 /2, 홀수배열은 2로 나눈 나머지를 더해서 계산
        oL = flags / 2 + flags % 2;
        eL = flags / 2;
//        실질적 인덱스
//        X - 나눈 나머지가 있으면 0 없으면 1
//        Y - 2로 나눈 값 +1 (1부터 시작)
//        ex) 7 > flag[0][4]
        flag[0] = new int[oL];
        flag[1] = new int[eL];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i++ < flags; ) { // i++ < flags 로 1 ~ flags
//            flag[i%2]
        }
    }
}
