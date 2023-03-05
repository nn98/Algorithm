package BaekJoon.DP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P2494_C {
    static int n, i, a[], b[], h[][], r;

    static int o(int x, int v) {
        if(x==n) return 0;
        if(h[x][v]!=0) return h[x][v];
        int ch=(a[x]+v)%10;
        int di=b[x]-ch;
        int l=(di>=0)?di:10+di;
        int r=(di>=0)?10-di:-di;
        int le=l+o(x+1,(v+l)%10);
        int ri=r+o(x+1,v);
        return h[x][v]=Math.min(le,ri);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(reader.readLine());
        a = new int[n];
        b = new int[n];
        h = new int[n][10];
        for (char c : reader.readLine().toCharArray()) a[i++] = c - '0';
        i = 0;
        for (char c : reader.readLine().toCharArray()) b[i++] = c - '0';
        o(0, 0);
        System.out.println(r);
        for (int[] X : h) System.out.println(Arrays.toString(X));
    }
}
