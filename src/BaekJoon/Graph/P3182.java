package BaekJoon.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P3182 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = -1;
        int[] seniors = new int[n+1];
        int[] history;
        int[] sums = new int[n+1];
        for (int i = 1; i <= n; i++) seniors[i] = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            history = new int[n+1];
            int now = i;
            int count = 0;
            while (history[now] < 1) {
                history[now] = 1;
                count++;
                int next = seniors[now];
//                if(sums[next] > 0) {
//                    count += sums[next];
//                    break;
//                }
//                System.out.println(String.format("i : %d / now : %d / count : %d / next : %d", i, now, count, next));
                now = next;
            }
//            System.out.println(String.format("i : %d / count : %d / sums : %s", i, count, Arrays.toString(sums)));
            sums[i] = count;
            max = Math.max(max, count);
        }
//        System.out.println(Arrays.toString(sums));
        for (int i = 1; i <= n; i++) {
            if (sums[i] == max) {
                System.out.print(i);
                break;
            }
        }
    }
}
