package BaekJoon.Greedy;

import java.io.*;
import java.util.*;

public class P1101_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                int aCount = (int) Arrays.stream(a)
                        .filter(x -> x != 0)
                        .count();
                int bCount = (int) Arrays.stream(b)
                        .filter(x -> x != 0)
                        .count();
                return aCount - bCount;
            }
        });
        long[] nonZero = new long[n];
        for (int i = 0; i < n; i++) {
            nonZero[i] = Arrays.stream(arr[i])
                    .filter(x -> x != 0)
                    .count();
        }
        int count = 0;
        for (int i = 0 ; i < n && nonZero[i] < 2; i++) {
            count++;
            if(nonZero[i] == 0) continue;
            int index = 0;
            while(arr[i][index] == 0) index++;
            for(int j = i-1; j >= 0 ; j--) {
                if(arr[j][index] != 0) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(n == count ? 0 : n-count-1);
    }
}
