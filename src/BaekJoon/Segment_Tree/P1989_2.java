package BaekJoon.Segment_Tree;

import java.io.*;
import java.util.*;

public class P1989_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        long size = Integer.parseInt(r.readLine()), m = 0, a[] = new long[(int) size], u,c,M;
        int i = 0, j;
        int L = 0, R = 0;
        Stack<Integer> k = new Stack();
        StringTokenizer t = new StringTokenizer(r.readLine());
        for (; i < size; i++) {
            a[(int) i] = Integer.parseInt(t.nextToken());
            u=0;
            M=1000001;
            while (!k.isEmpty() && a[(Integer) k.peek()] > a[i]) {
                j=k.pop();
                u+=a[j];
                M=M<a[j]?M:a[j];
                c = u * M;
                if(!k.isEmpty())System.out.println(a[(Integer) k.peek()] +" "+ a[i]+" "+u+" "+M+" "+i);
                if (m < c) {
                    if (!k.isEmpty()) System.out.print(k.peek() + " " + i);
                    else System.out.print(0 + " " + i);
                    if (!k.isEmpty()) {
                        L = k.peek();
                        R = i;
                    } else {
                        L = 0;
                        R = i;
                    }
                    System.out.println(" " + c);
                    m = c;
                }
            }
            k.push(i);
        }
        u=0;
        M=1000001;
        while (!k.isEmpty() && a[(Integer) k.peek()] > a[i]) {
            j=k.pop();
            u+=a[j];
            M=M<a[j]?M:a[j];
            c = u * M;
            if(!k.isEmpty())System.out.println(a[(Integer) k.peek()] +" "+ a[i]+" "+u+" "+M+" "+i);
            if (m < c) {
                if (!k.isEmpty()) System.out.print(k.peek() + " " + i);
                else System.out.print(0 + " " + i);
                if (!k.isEmpty()) {
                    L = k.peek();
                    R = i;
                } else {
                    L = 0;
                    R = i;
                }
                System.out.println(" " + c);
                m = c;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(m);
        System.out.println(L + " " + R);
    }
}