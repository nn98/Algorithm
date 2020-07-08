package _Algorithm.DP;

import java.io.*;
import java.util.*;

public class P11066 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),m,i,a;
		while(n-->0) {
			a=0;
			m=Integer.parseInt(r.readLine());
			StringTokenizer t=new StringTokenizer(r.readLine());
			PriorityQueue<Integer> p=new PriorityQueue();
			while(m-->0)p.add(Integer.parseInt(t.nextToken()));
			while(p.size()>1) {
				System.out.println(p+" "+a);
				a+=i=p.poll()+p.poll();
				p.add(i);
			}
			System.out.println(p);
			System.out.println(a);
		}
	}

}
// 뭐지 이게 더 효율적인거같은데