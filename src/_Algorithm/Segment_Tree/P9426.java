package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P9426 {
    static int n, k, a[], i, j;
    static long R;
    static List<Integer> l = new ArrayList<>();

    static void insert(int value, int s,int e) {
//        System.out.println(value+" "+s+" "+e);
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
        l.remove(0);
        return v;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] a = r.readLine().split(" ");
        n=Integer.parseInt(a[0]);
        k=Integer.parseInt(a[1]);
        for(;i<n;i++){
            insert(Integer.parseInt(r.readLine()),0,l.size()-1);
//            System.out.println(l);
            R+=check();
//            System.out.println(R);
        }
        System.out.println(R);
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

 */