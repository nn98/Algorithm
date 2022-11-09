package _Algorithm.Segment_Tree;
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
    public static void main(String[] args)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
        String[]t=r.readLine().split(" ");
        n=Integer.parseInt(t[0]);
        for(l=1;l<=n;l*=2);
        a=new int[l];
        b=new int[l];
        c=new int[l];
        l/=2;
        for(;i<n;u=j=i+++l,b[j]=a[j]=Integer.parseInt(r.readLine()),p(),q());
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

}
