package _Algorithm.BFS;

import java.io.*;
import java.util.*;

public class P6118_2{  
    static int n, m, i, j, x, h[], r,P,C;
    static List<Integer>l[];
    static Queue<Integer> q=new LinkedList();

    public static void main(String[] args) throws Exception {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String[]c=b.readLine().split(" ");
        n = Integer.parseInt(c[0]);
        m = Integer.parseInt(c[1]);
        l=new List[n];
        h = new int[n];
        for (; x < m; x++) {
            c=b.readLine().split(" ");
            i = Integer.parseInt(c[0])-1;
            j = Integer.parseInt(c[1])-1;
            if(l[i]==null)l[i]=new ArrayList();
            l[i].add(j);
            if(l[j]==null)l[j]=new ArrayList();
            l[j].add(i);
        }
        x=0;
        i=1;
        h[0]=1;
        q.add(0);
        while(!q.isEmpty()) {
            System.out.println(q);
            P--;
            j=q.poll();
            for(int k:l[j]) {
                if(h[k]<1) {
                    if(i>r) {
                        r=i;
                        x=0;
                    }
                    if(i==r)x++;
                    h[k]=i;
                    q.add(k);
                    C++;
                }
            }
            if(P<1) {
                P=C;
                C=0;
                i++;
            }
            System.out.println(Arrays.toString(h)+" "+P+" "+C+" "+i+" "+r);
        }
        for(i=0;i<n;i++)if(h[i]==r)j=i;
        System.out.println(j+1+" "+r+" "+x);
    }

}
