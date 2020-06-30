package _Algorithm.Sorting;

import java.io.*;
import java.util.*;
public class P3770 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),m=0,e,w,i,p,q,j,R;
		while(m++<n) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			e=Integer.parseInt(t.nextToken());
			w=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			PriorityQueue<Integer>[]a=new PriorityQueue[w];
			R=0;
			while(i-->0) {
				t=new StringTokenizer(r.readLine());
				p=Integer.parseInt(t.nextToken());
				q=Integer.parseInt(t.nextToken())-1;
				if(a[q]==null)a[q]=new PriorityQueue();
				a[q].add(p);
			}
//			System.out.println(Arrays.toString(a));
			for(i=w;i-->0;) {
				while(!a[i].isEmpty()) {
					p=a[i].poll();
//					System.out.println(p);
					for(j=i;j-->0;) {
						Iterator<Integer> x=a[j].iterator();
						while(x.hasNext()) {
//							System.out.println("\t"+(e=x.next()));
							if(p<e)R++;
						}
					}
				}
			}
			System.out.println("Test case "+m+": "+R);
		}
	}

}
