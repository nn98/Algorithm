package BaekJoon.Segment_Tree;
import java.io.*;
import java.util.Arrays;
public class P6213 {
    static int n,m,i,j,u,l,a[],b[],c[];
    static void p() {
        for(;j>1;j/=2,a[j]=Math.max(a[j*2],a[j*2+1]));
    }
    static void q() {
        for(;u>1;u/=2,b[u]=Math.min(b[u*2],b[u*2+1]),c[u]=a[u]-b[u]);
    }
    static int P(int n,int s,int e){
        if(s>j|i>e) return Integer.MIN_VALUE;
        if(i<=s&e<=j)return a[n];
        int m=(s+e)/2;
        return Math.max(P(n*2,s,m),P(n*2+1,m+1,e));
    }
    static int Q(int n,int s,int e){
        if(s>j|i>e) return Integer.MAX_VALUE;
        if(i<=s&e<=j)return b[n];
        int m=(s+e)/2;
        return Math.min(Q(n*2,s,m),Q(n*2+1,m+1,e));
    }
    public static void main(String[] args)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
        String[]t=r.readLine().split(" ");
        n=Integer.parseInt(t[0]);
        for(l=1;l<=n;l*=2);
        a=new int[l*2];
        Arrays.fill(a,Integer.MIN_VALUE);
        b=new int[l*2];
        Arrays.fill(b,Integer.MAX_VALUE);
        c=new int[l*2];
        for(;i<n;u=j=i+++l,b[j]=a[j]=Integer.parseInt(r.readLine()),p(),q());
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(c));
        for(m=Integer.parseInt(t[1]);m-->0;){
            t=r.readLine().split(" ");
            i=Integer.parseInt(t[0]);
            j=Integer.parseInt(t[1]);
//            System.out.println(P(1,1,l));
//            System.out.println(Q(1,1,l));
            w.write(P(1,1,l)-Q(1,1,l)+"\n");
        }
        w.flush();
    }

}
