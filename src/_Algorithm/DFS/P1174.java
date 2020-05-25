package _Algorithm.DFS;

import java.util.LinkedList;
import java.util.Queue;

public class P1174 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=0,j,r=-1;
		String t="";
		if(n<1023) {
			r=0;
			Queue<String>q=new LinkedList();
			for(;i<10;q.add(""+i++));
			while(r<n) {
				t=q.poll();
				for(j=0;j<(t.charAt(t.length()-1)-'0');j++)q.add(t+j);
				r++;
			}
		}
		System.out.println(r<0?r:t);
	}

}
