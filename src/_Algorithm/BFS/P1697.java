package _Algorithm.BFS;

import java.util.Arrays;

public class P1697 {
    static String[]a=new java.util.Scanner(System.in).nextLine().split(" ");
    static int n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),l=100001,b[]=new int[l],N=Integer.MAX_VALUE,r=Integer.MAX_VALUE,c;
    static void o(int x,int v) {
        for(int i=0;i<v;i++,System.out.print("\t"));
        System.out.println(x+" "+v);
        b[x]=v;
        if(x==m) {
            N=v;
            if(r>b[x]) {
                System.out.println(x+" "+v);
                r=b[x];
                c=1;
            }
        }
//        System.out.println(Arrays.toString(b));
        v++;
        if(v<=N) {
            int X=x*2;
            if(x<m)if(X<l&X<=l)
                if(b[X]==v&X==m) {
                    c++;
                    System.out.println(x+" "+v);
                }
                else if(b[X]>v|b[X]<0)o(X,v);
            X=x+1;
            if(x<m)if(X<l&X<=l)
                if(b[X]==v&X==m) {
                    c++;
                    System.out.println(x+" "+v);
                }
                else if(b[X]>v|b[X]<0)o(X,v);
            X=x-1;
            if(X>0&X<=l)
                if(b[X]==v&X==m) {
                    c++;
                    System.out.println(x+" "+v);
                }
                else if(b[X]>v|b[X]<0)o(X,v);
        }
    }
    public static void main(String[] args) {
        Arrays.fill(b,-1);
        o(n,0);
//        System.out.println(Arrays.toString(b));
        System.out.print(b[m]+"\n"+c);
    }

}
