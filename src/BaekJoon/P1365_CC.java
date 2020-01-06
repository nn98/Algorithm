package BaekJoon;
import java.io.*;
import java.util.StringTokenizer;
public class P1365_CC {

	//다슬이형
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (dp[j] < arr[i]) {
                dp[++j] = arr[i];
            } else {
                int ans = lowerBound(j, arr[i]);
                dp[ans] = arr[i];
            }
        }

        bw.write(n - (j + 1) + "");
        bw.close();
        br.close();
    }

    static int lowerBound(int end, int key) {
        int start = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if(dp[mid] >= key) end = mid;
            else start = mid + 1;
        }
        return end;
    }
}