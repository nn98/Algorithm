package BaekJoon.Segment_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P6549_RE {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        while (!s.equals("0")) {
            StringTokenizer t = new StringTokenizer(s);
            long size = Integer.parseInt(t.nextToken()), m = 0, a[] = new long[(int) size], j;
            int i = 0;
            Stack<Integer> k = new Stack();
            for (; i < size; i++) {
                a[(int) i] = Integer.parseInt(t.nextToken());
//                스택 꼭대기값이 지금 인덱스의 값보다 크면
                while (!k.isEmpty() && a[(Integer) k.peek()] > a[i]) {
//                    꼭대기값 꺼내서
                    j = k.pop();
//                    해당 값 * (지금 인덱스 - (다음 꼭대기값+1))==길이 > 직사각형 크기
                    long w = i;
                    if (!k.isEmpty()) w -= k.peek() + 1;
                    long c = a[(int) j] * w;
                    if(m<c){
                        if (!k.isEmpty())System.out.print(k.peek()+1+" "+i);
                        else System.out.print(0+ " "+i);
                        System.out.println(" "+c);
                        m=c;
                    }
                }
                k.push(i);
            }
            while (!k.isEmpty()) {
                j = k.pop();
                long w = i;
                if (!k.isEmpty()) w -= k.peek() + 1;
                long c = a[(int) j] * w;
                m = m < c ? c : m;
            }
            System.out.println(m);
            s = r.readLine();
        }
    }
}