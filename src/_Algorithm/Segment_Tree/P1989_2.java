package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P1989_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        long size = Integer.parseInt(r.readLine()), m = 0, a[] = new long[(int) size], j, u=0;
        int i = 0;
        int L = 0, R = 0;
        Stack<Integer> k = new Stack();
        StringTokenizer t = new StringTokenizer(r.readLine());
        for (; i < size; i++) {
            a[(int) i] = Integer.parseInt(t.nextToken());
//                스택 꼭대기값이 지금 인덱스의 값보다 크면
            while (!k.isEmpty() && a[(Integer) k.peek()] > a[i]) {
//                    꼭대기값 꺼내서
//                    해당 값 * (지금 인덱스 - (다음 꼭대기값+1))==길이 > 직사각형 크기
                long w = i;
                if (!k.isEmpty()) w -= k.peek() + 1;
                long c = u * w;
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
                u-=a[k.pop()];
            }
            k.push(i);
            u+=a[i];
        }
        while (!k.isEmpty()) {
            j = k.pop();
            long w = i;
            if (!k.isEmpty()) w -= k.peek() + 1;
            long c = a[(int) j] * w;
            if (m < c) {
                if (!k.isEmpty()) {
                    L = k.peek();
                    R = i;
                } else {
                    L = 0;
                    R = i;
                }
                m = c;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(m);
        System.out.println(L + " " + R);
    }
}