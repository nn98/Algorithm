package BaekJoon.Greedy;

import java.io.*;
import java.util.*;

public class P1101 {
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
                return (Arrays.stream(a)
                        .filter(x -> x != 0)
                        .count()) - (Arrays.stream(b)
                        .filter(x -> x != 0)
                        .count());
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}