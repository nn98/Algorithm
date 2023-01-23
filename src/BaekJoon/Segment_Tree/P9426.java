package BaekJoon.Segment_Tree;
// 어케 맞았ㄴ노
import java.io.*;
import java.util.*;

public class P9426 {
    static int n, k, a[], i, j;
    static long R;
    static List<Integer> l = new ArrayList<>();

    static void insert(int value, int s,int e) {
        if(l.isEmpty())l.add(value);
        else if(e<=s){
            if(value>l.get(s)){
                if(l.size()==s)l.add(value);
                else l.add(s+1,value);
            }
            else l.add(s,value);
        }
        else {
            int m=(s+e)/2,M=l.get(m);
            if(M==value)l.add(m,value);
            else if(M<value)insert(value,m+1,e);
            else insert(value,s,m-1);
        }
    }
    static int check() {
        if(l.size()<k)return 0;
        int v=l.get((k+1)/2-1);
        l.remove(new Integer(a[j++]));
        return v;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] b = r.readLine().split(" ");
        n=Integer.parseInt(b[0]);
        k=Integer.parseInt(b[1]);
        a=new int[n];
        for(;i<n;i++){
            a[i]=Integer.parseInt(r.readLine());
            insert(a[i],0,l.size()-1);
            R+=check();
        }
        System.out.print(R);
    }
}
/*
10 3
7
8
6
9
1
5
74
2
4
8

15 6
84
37
61
27
38
49
72
42
41
38
94
16
72
34
85

 */