package _Algorithm.BFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2660 {
    static int n,i,j,m=Integer.MAX_VALUE,c[][],h[];
    static List<Integer>[]l;
    static void o(int i,int f,int v) {
        c[f][i]=v++;
        for(int j:l[i])if(c[f][j]>v|c[f][j]<1&j!=f)o(j,f,v);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
        n=Integer.parseInt(r.readLine())+1;
        l=new List[n];
        h=new int[n];
        for(;i<n;l[i++]=new ArrayList());
        c=new int[n][n];
        for(;;) {
            String[]a=r.readLine().split(" ");
            if(a[0].equals("-1")&a[1].equals("-1"))break;
            i=Integer.parseInt(a[0]);
            j=Integer.parseInt(a[1]);
            l[i].add(j);
            l[j].add(i);
        }
        for(i=0;++i<n;)for(int j:l[i])o(j,i,1);
        for(i=0;++i<n;)for(int j:c[i]) {
            if(j>0) {
                h[i]=h[i]>j?h[i]:j;
            }
        }
        for(int[]a:c)System.out.println(Arrays.toString(a));
        for(j=0;++j<n;)m=m<h[j]?m:h[j];
        i=0;
        for(int j:h)i+=j==m?1:0;
        System.out.println(m+" "+i);
        for(j=0;++j<n;System.out.print(h[j]==m?j+" ":""));
    }

}
// 한놈이라도 친구관계 없으면 에러네
