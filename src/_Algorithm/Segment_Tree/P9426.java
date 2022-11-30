package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P9426 {
    static int n, k, a[], i, j;
    static List<Integer> l = new ArrayList<>();

    static void insert(int value, int s,int e) {
        if(l.isEmpty())l.add(value);
        if(e<=s)l.add(s,value);
        else {
            int m=(s+e)/2,M=l.get(m);
            if(M==value)l.add(m,value);
            else if(M<value)insert(value,m+1,e);
            else insert(value,s,m-1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] a = r.readLine().split(" ");
        n=Integer.parseInt(a[0]);
        k=Integer.parseInt(a[1]);
        for(;i<n;i++){
            insert(Integer.parseInt(r.readLine()),0,l.size());
        }
        System.out.println(l);
    }
}
