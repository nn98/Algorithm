package Programmers.DP;

import java.util.Arrays;

public class P161988 {
    static int n;
    static long r;
    static long[] seq, hA,hB;
    static void o(int x,int f) {
        if(x<0)return;
        if(f==1) {
            hA[x]=seq[x];
            hB[x]=seq[x]*-1;
        } else {
            hA[x]=seq[x]*-1;
            hB[x]=seq[x];
        }
        if(hA[x+1]>0) hA[x]+=hA[x+1];
        if(hB[x+1]>0) hB[x]+=hB[x+1];
        System.out.println(x+" "+f+" "+hA[x]);
        r=Math.max(r,hA[x]);
        r=Math.max(r,hB[x]);
        o(x-1,f==1?0:1);
    }
    static public long solution(int[] sequence) {
        r=Long.MIN_VALUE;
        n=sequence.length;
        seq=new long[n+1];
        for(int i=0;i<n;seq[i]=sequence[i++]);
        hA=new long[n+1];
        hB=new long[n+1];
        o(n-1,1);
        // System.out.println(Arrays.toString(hA));
        // System.out.println(Arrays.toString(hB));
        return r;
    }

    public static void main(String[] args) {
//        System.out.println(solution(new int[]{2, 3, -6, 1, 3, -1, 2, 4}));
//        System.out.println(solution(new int[]{1}));
        int[] a=new int[500000];
        Arrays.fill(a,-100000);
        for(int i=0;i<500000;a[i]*=-1,i+=2);
        System.out.println(solution(a));
    }
}
