package _Algorithm.DFS;

import java.util.LinkedList;
import java.util.Queue;

public class P1174 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=0,j,r=-1;
		if(n<1023) {
			r=0;
			Queue<String>q=new LinkedList();
			for(;i<10;) {
				q.add(""+i++);
				r++;
			}
			System.out.println(q);
			System.out.println(r);
		}
	}

}
