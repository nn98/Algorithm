package BaekJoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1927_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m;
		PriorityQueue<Integer>q=new PriorityQueue();
		for(;n-->0;) {
			m=s.nextInt();
			if(m==0)System.out.println(q.isEmpty()?0:q.poll());
			else q.add(m);
		}
	}

}
