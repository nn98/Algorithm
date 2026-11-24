package BaekJoon.Two_Pointer.P2230;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] sequence = new long[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(sequence);
        int left = 0;
        int right = 0;
        long ans = Integer.MAX_VALUE;
        while (left < n && right < n) {
            long diff = sequence[right] - sequence[left];
            if (diff < m && right < n - 1) {
                right++;
                continue;
            }
            if (diff >= m) {
                ans = Math.min(ans, diff);
            }
            left++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
    }
}
