package BaekJoon.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] seniors = new int[n];
    int[] history;
    int[] sums = new int[n];
    for (int i = 0; i < n; i++) seniors[i] = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
        history = new int[n];
        int now = i;
        int count = 0;
        while (history[now] < 1) {
            history[now] = 1;
            count++;
            int next = seniors[i];
            if(sums[next] > 0) {
                count += sums[next];
                break;
            }
            now = next;
        }
        sums[i] = count;
    }
    System.out.println(Arrays.toString(sums));
}