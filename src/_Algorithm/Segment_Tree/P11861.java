package _Algorithm.Segment_Tree;
import java.io.*;
import java.util.*;

public class P11861 {
    public static void main(String[] args)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        long n=Integer.parseInt(r.readLine()),m=0,a[]=new long[(int)n],j;
        StringTokenizer t=new StringTokenizer(r.readLine());
        int i=0;
        Stack<Integer>k=new Stack();
        for(;i<n;i++) {
            a[(int)i]=Integer.parseInt(t.nextToken());
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