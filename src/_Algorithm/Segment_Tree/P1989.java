package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1989 {
    static long n,a[],r,b[],p,q,N,R;
    static int i,j,l,M=1000001,left,right;
    static void o(){
        for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1],b[j]=Math.min(b[j*2],b[j*2+1]));
    }
    static long sum(int n,int s,int e){
//        System.out.printf("%d %d %d %d %d\n",n,s,e,i,j);
        if(s>j|e<i)return 0;
        if(s>=i&e<=j)return a[n];
        int m=(s+e)/2;
        return sum(n*2,s,m)+sum(n*2+1,m+1,e);
    }
    static long min(int n,int s,int e){
        if(s>j|e<i)return M;
        if(s>=i&e<=j)return b[n];
        int m=(s+e)/2;
        return Math.min(min(n*2,s,m),min(n*2+1,m+1,e));
    }
    public static void main(String[] args)throws Exception{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(bufferedReader.readLine());
        for(l=1;l<n;l*=2);
        a=new long[l*2];
        b=new long[l*2];
//        c=new int[l*2];
        Arrays.fill(b,M);
        for(String s:bufferedReader.readLine().split(" ")){
            j=l+i++;
            a[j]=b[j]=Integer.parseInt(s);
//            a[j]=b[j]=c[j]=Integer.parseInt(s);
            o();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for(i=0;++i<n;)
            for(j=i;++j<=n;){
                p=sum(1,1,l);
                q=min(1,1,l);
                N=p*q;
                if(N>R){
                    R=N;
                    left=i;
                    right=j;
                }
            }
        System.out.println(R);
        System.out.println(left+" "+right);
//        System.out.println(Arrays.toString(c));
    }
}
