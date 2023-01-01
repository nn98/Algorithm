package _Contest.C915;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    static int n,m,i,a[],j,b[];
    static long r;
    static void o(int i,int j,long v){
        System.out.println(i+" "+j+" "+v);
        b[i]=b[j]=1;
        r=r>v?r:v;
        if(i>0){
            int I=i;
            for(;--i>0&b[i]>0;);
            if(i>=0)if(v+a[i]>0)o(i,j,v+a[i]);
            i=I;
        }
        if(j<n){
            int J=j;
            for(;++j<n&b[j]>0;);
            if(j<n)if(v+a[j]>0)o(i,j,v+a[j]);
            j=J;
        }
        b[i]=b[j]=0;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer=new StringTokenizer(reader.readLine());
        n=Integer.parseInt(stringTokenizer.nextToken());
        m=Integer.parseInt(stringTokenizer.nextToken())-1;
        a=new int[n];
        b=new int[n+1];
        stringTokenizer=new StringTokenizer(reader.readLine());
        for(;i<n;a[i++]=Integer.parseInt(stringTokenizer.nextToken()));
        o(m,m,a[m]);
        System.out.println(r);
    }
}
