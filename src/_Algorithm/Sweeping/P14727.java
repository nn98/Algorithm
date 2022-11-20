package _Algorithm.Sweeping;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P14727 {
    public static void main(String[] args)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        long n=Integer.parseInt(r.readLine()),m=0,a[]=new long[(int)n],j;
        int i=0;
        Stack<Integer>k=new Stack();
        for(;i<n;i++) {
            a[(int)i]=Integer.parseInt(r.readLine());
            while(!k.isEmpty()&&a[(Integer)k.peek()]>a[i]) {
                j=k.pop();
                long w=i;
                if(!k.isEmpty())w-=k.peek()+1;
                long c=a[(int)j]*w;
                m=m<c?c:m;
            }
            k.push(i);
        }
        while(!k.isEmpty()){
            j=k.pop();
            long w=i;
            if(!k.isEmpty())w-=k.peek()+1;
            long c=a[(int)j]*w;
            m=m<c?c:m;
        }
        System.out.println(m);
    }
}