package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class P10090 {
    static int n, l=1, i, j, t[];
    static long R;

    static void o() {
        for (; j > 1; j /= 2, t[j] = t[j * 2] + t[j * 2 + 1]) ;
    }

    static int p(int n,int s,int e) {
        if(s>j|e<i) return 0;
        if(i<=s&e<=j)return t[n];
        int m=(s+e)/2;
        return p(n*2,s,m)+p(n*2+1,m+1,e);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(r.readLine());
        for(;l<n;l*=2);
        t=new int[l*2];
        for(String s:r.readLine().split(" ")){
            i=Integer.parseInt(s);
            j=i+l-1;
            t[j]++;
            o();
            j=n;
            System.out.println(Arrays.toString(t));
            System.out.println(i+" "+j);
            System.out.println(p(1,1,l));
            R+=p(1,1,l);
        }
        System.out.println(R);
    }
}
