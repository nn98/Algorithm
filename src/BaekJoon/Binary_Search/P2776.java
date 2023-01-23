package BaekJoon.Binary_Search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P2776 {
    static int o(int s, int e, int t, int[] a) {
//        System.out.println(s+" "+e+" "+t);
        if (e < s) return 0;
        int m = (s + e) / 2;
        if (a[m] == t) return 1;
        if (a[m] > t) return o(s, m - 1, t, a);
        else return o(m + 1, e, t, a);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = Integer.parseInt(br.readLine()); i-- > 0; ) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            int j = 0;
            for (String s : br.readLine().split(" ")) {
                a[j++] = Integer.parseInt(s);
            }
            Arrays.sort(a);
            br.readLine();
            for (String s : br.readLine().split(" ")) {
                bw.write(o(0, n - 1, Integer.parseInt(s), a) + "\n");
            }
            bw.flush();
        }
    }
}
