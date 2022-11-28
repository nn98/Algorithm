package _Algorithm.BFS;

import java.io.*;
import java.util.*;

public class P6118_2{  
    static int n, m, i, j, x, h[], r;
    static List<Integer>l[];
    static void o(int x, int v) {
        h[x] = v++;
        for (int i = 0; i < n; i++) {
            if (a[x][i] > 0)
                if (h[i] > v)
                    o(i, v);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(b.readLine());
        m = Integer.parseInt(b.readLine());
        l=new List[n];
        h = new int[n];
        Arrays.fill(h, Integer.MAX_VALUE);
        for (; x < m; x++) {
            String[]c=b.readLine().split(" ");
            i = Integer.parseInt(c[0])-1;
            j = Integer.parseInt(c[1])-1;
            if(l[i]==null)l[i]=new ArrayList();
            l[i].add(j);
            if(l[j]==null)l[j]=new ArrayList();
            l[j].add(i);
        }
        o(0, 0);
        i = j = 0;
        for (x = 0; x < n; x++) {
            r = r > h[x] ? r : h[x];
        }
        for (; x-- > 0;) {
            if (h[x] == r) {
                i = x;
                j++;
            }
        }
        System.out.print(i + 1 + " " + r + " " + j);
    }

}
